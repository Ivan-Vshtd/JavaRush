package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallon", new Date("MARCH 1 1980"));
        map.put("Stallo", new Date("DECEMBER 1 1980"));
        map.put("Stall", new Date("JUNE 1 1980"));
        map.put("Stal", new Date("FEBRUARY 1 1980"));
        map.put("Sta", new Date("JULY 1 1980"));
        map.put("St", new Date("AUGUST 1 1980"));
        map.put("S", new Date("APRIL 1 1980"));
        map.put("tallone", new Date("SEPTEMBER 1 1980"));
        map.put("allone", new Date("NOVEMBER 1 1980"));

        return map;//напишите тут ваш код

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            int month = iterator.next().getValue().getMonth() + 1;
            if (6 <= month && month <= 8)
            {
                iterator.remove();
            }
        }

    }
}
