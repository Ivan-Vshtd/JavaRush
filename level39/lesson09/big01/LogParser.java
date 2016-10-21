package com.javarush.test.level39.lesson09.big01;

import com.javarush.test.level39.lesson09.big01.query.IPQuery;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogParser implements IPQuery
{
    private Path logDir;
    private ArrayList<String> list;

    public LogParser(Path logDir)
    {
        this.logDir = logDir;
        list = getListOfLog();
    }

    @Override
    public int getNumberOfUniqueIPs(Date after, Date before)
    {
        return getUniqueIPs(after, before).size();
    }

    @Override
    public Set<String> getUniqueIPs(Date after, Date before)
    {
        return getAllValidIPs("", after, before);
    }

    @Override
    public Set<String> getIPsForUser(String user, Date after, Date before)
    {
        return getAllValidIPs(user, after, before);
    }

    @Override
    public Set<String> getIPsForEvent(Event event, Date after, Date before)
    {
        return getAllValidIPs(event.toString(), after, before);
    }

    @Override
    public Set<String> getIPsForStatus(Status status, Date after, Date before)
    {
        return getAllValidIPs(status.toString(), after, before);
    }

    private Set<String> getAllValidIPs(String str, Date after, Date before)
    {
        Set<String> set = new HashSet<>();
        Pattern pattern = Pattern.compile("\\d{1,3}.\\d{1,3}.\\d{1,3}.\\d{1,3}");
        if (list == null)
            return null;
        for (String s : list)
        {
            if (s.contains(str))
            {
                Matcher m1 = pattern.matcher(s);
                if (m1.find())
                {
                    String correct = m1.group();
                    if (isValidDate(s, after, before))
                        set.add(correct);
                }
            }
        }
        return set;
    }

    private boolean isValidDate(String str, Date after, Date before)
    {
        Pattern pattern = Pattern.compile("\\d{2}.\\d{2}.\\d{4}\\s\\d{1,2}:\\d{2}:\\d{2}");
        Pattern pattern2 = Pattern.compile("[^\\d]\\d{1}[^\\d]");
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss", Locale.ENGLISH);
        Matcher m1 = pattern.matcher(str);
        if (m1.find())
        {
            String correct = m1.group();
            Matcher m2 = pattern2.matcher(correct);
            // Проверяем нет содержит ли дата значений из одной цифры. Если содержит, добавляем 0 перед такой цифрой
            if (m2.find())
            {
                correct = correct.substring(0, m2.start() + 1) + "0" + correct.substring(m2.start() + 1, correct.length());
            }
            try
            {
                Date dateOfCurrentLog = format.parse(correct);
                if (after == null)
                    after = new Date(0);
                if (before == null && dateOfCurrentLog.getTime() >= after.getTime())
                    return true;
                if (dateOfCurrentLog.getTime() >= after.getTime() && dateOfCurrentLog.getTime() <= before.getTime())
                {
                    return true;
                }
            }
            catch (Exception e)
            {
            }
        }
        return false;
    }

    private ArrayList<String> getListOfLog()
    {
        ArrayList<String> list = new ArrayList<>();
        File file = listFilesForFolder(logDir.toFile());
        if (file == null)
            return null;
        try (BufferedReader reader = new BufferedReader(new FileReader(file)))
        {
            String line = "";
            while ((line = reader.readLine()) != null)
            {
                list.add(line);
            }
        }
        catch (Exception e)
        {
        }
        return list;
    }

    private File listFilesForFolder(final File folder)
    {
        for (final File fileEntry : folder.listFiles())
        {
            if (fileEntry.isDirectory())
            {
                listFilesForFolder(fileEntry);
            } else
            {
                if (fileEntry.getName().endsWith(".log"))
                    return fileEntry;
            }
        }
        return null;
    }
}