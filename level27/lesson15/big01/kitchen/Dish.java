package com.javarush.test.level27.lesson15.big01.kitchen;

import java.util.Arrays;

/**
 * Created by user on 11.07.2016.
 */
public enum Dish
{
    Fish(25),
    Steak(30),
    Soup(15),
    Juice(5),
    Water(3);
    public static String allDishesToString()
    {
        return values().length == 0 ? "" : Arrays.toString(values()).substring(1, Arrays.toString(values()).length() - 1);
    }
    private int duration;

    public int getDuration()
    {
        return duration;
    }

    Dish(int duration)
    {
        this.duration = duration;
    }
}
