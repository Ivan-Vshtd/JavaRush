package com.javarush.test.level27.lesson15.big01.ad;

import com.javarush.test.level27.lesson15.big01.ConsoleHelper;

import java.util.*;

/**
 * Created by user on 11.07.2016.
 */
public class AdvertisementManager
{
    private final AdvertisementStorage storage = AdvertisementStorage.getInstance();
    private int timeSeconds;

    public AdvertisementManager(int timeSeconds)
    {
        this.timeSeconds = timeSeconds;
    }

    private class VideoSet
    {
        private int fullDuration;
        private long fullAmount;                                           //создаем внутренний класс который будет хранить
        private ArrayList<Advertisement> videoSet;                          //нужные значения, чтобы много раз не пересчитывать.

        public VideoSet(ArrayList<Advertisement> videoSet)
        {
            this.videoSet = videoSet;
            for (Advertisement advertisement : videoSet)
            {
                fullDuration += advertisement.getDuration();         //При добавлении видеоряда значения инициализируются
                fullAmount += advertisement.getAmountPerOneDisplaying();
            }
        }
    }

    public void processVideos()
    {
        List<Advertisement> list = storage.list();
        ArrayList<VideoSet> sets = new ArrayList<>();
        //Удаляем из переданного списка видео c hits меньше 1
        //И с продолжительностью больше времени заказа.
        Iterator<Advertisement> iterator = list.iterator();
        while (iterator.hasNext())
        {
            Advertisement video = iterator.next();
            if (video.getHits() <= 0 && video.getDuration() > timeSeconds)
            {
                iterator.remove();
            }
        }
        List<Advertisement> availableVideos = searchAvailableVideo(list, sets, 0, 1 << list.size());
        if (availableVideos.isEmpty()) throw new NoVideoAvailableException();
        Collections.sort(availableVideos, new Comparator<Advertisement>()
        {   //Сортируем видео по стоимости
            @Override
            public int compare(Advertisement o1, Advertisement o2)
            {
                int result = (int) o2.getAmountPerOneDisplaying() - (int) o1.getAmountPerOneDisplaying();
                if (result == 0)
                {
                    double amountPerSec1 = (o1.getDuration() * 1.0d) / o1.getAmountPerOneDisplaying();
                    double amountPerSec2 = (o2.getDuration() * 1.0d) / o2.getAmountPerOneDisplaying();
                    double difference = amountPerSec2 - amountPerSec1;
                    result = (int) difference;
                }
                return result;
            }
        });
        //выводим на экран отсортированное видео
        for (Advertisement video : availableVideos)
        {
            long amountPerOneDisplaying = video.getAmountPerOneDisplaying();
            int duration = video.getDuration();
            double amountPerSec = (double) amountPerOneDisplaying / duration;
            ConsoleHelper.writeMessage(String.format("%s is displaying... %d, %d", video.getName(),
                    amountPerOneDisplaying, (long) (amountPerSec * 1000)));
            video.revalidate();
        }
    }

    private List<Advertisement> searchAvailableVideo(List<Advertisement> list, List<VideoSet> sets, int mask, int limit)
    {
        if (mask < limit)
        {
            ArrayList<Advertisement> set = new ArrayList<>();
            for (int i = 0; i < list.size(); i++)
            {
                //если бит номер i еденичный, добавляем i-й элемент списка
                if ((mask & (1 << i)) != 0)
                {
                    set.add(list.get(i));
                }
            }
            VideoSet videoSet = new VideoSet(set);
            if (videoSet.fullDuration <= timeSeconds)
            {
                sets.add(videoSet);
            }
            searchAvailableVideo(list, sets, mask + 1, limit);
        }
        //Находим оптимальный видеоряд
        Collections.sort(sets, new Comparator<VideoSet>()
        {
            @Override
            public int compare(VideoSet o1, VideoSet o2)
            {
                int result = Long.compare(o1.fullAmount, o2.fullAmount);
                if (result == 0)
                {
                    result = Integer.compare(o2.fullDuration, o1.fullDuration);
                }
                if (result == 0)
                {
                    result = Integer.compare(o2.videoSet.size(), o1.videoSet.size());
                }
                return result;
            }
        });
        //берем результат из конца списка
        ArrayList<Advertisement> resultList = sets.get(sets.size() - 1).videoSet;
        return resultList;
    }
}

