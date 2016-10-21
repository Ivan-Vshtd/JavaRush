package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("Ivanov","Ivan");
        map.put("Petrov","Petr");
        map.put("Sidorov","Sidr");
        map.put("Fedorov","Fedr");
        map.put("Lukashenko","Aleksandr");
        map.put("Ivanchik","Viktor");
        map.put("Viktorov","Petr");
        map.put("Smirnov","Fedr");
        map.put("Smirnovich","Aleksei");
        map.put("Sohin","Alena");
        return map;//напишите тут ваш код

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count=0;
        for (Map.Entry<String,String> pair : map.entrySet())
        {
            String value = pair.getValue();
            if (name.equals(value))
            {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int count=0;
        for (Map.Entry<String,String> pair : map.entrySet())
        {
            String key = pair.getKey();
            if (lastName.equals(key))
            {
                count++;
            }
        }
        return count;//напишите тут ваш код

    }
}
