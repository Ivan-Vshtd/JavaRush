package com.javarush.test.level33.lesson15.big01;

import com.javarush.test.level33.lesson15.big01.strategies.StorageStrategy;

/**
 * Created by user on 26.07.2016.
 */
public class Shortener
{
    private Long lastId = 0L;
    private StorageStrategy storageStrategy;

    public Shortener(StorageStrategy storageStrategy)
    {
        this.storageStrategy = storageStrategy;
    }

    public synchronized Long getId(String string)
    {String id;
        if (storageStrategy.containsValue(string)) {
            // если есть – вернуть его ключ
            return storageStrategy.getKey(string);
        }
        else
        {
            lastId++;
            storageStrategy.put(lastId,string);
            return lastId;
        }


    }
    public synchronized String getString(Long id)
    {
        if (storageStrategy.containsKey(id)) {
            return storageStrategy.getValue(id);
        }
        else {
            return null;
        }
    }
}
