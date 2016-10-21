package com.javarush.test.level27.lesson15.big01.kitchen;

import com.javarush.test.level27.lesson15.big01.ConsoleHelper;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by user on 11.07.2016.
 */
public class Cook  extends Observable implements Observer
{
    public final String name;

    public Cook(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return name;
    }

    @Override
    public void update(Observable observable, Object arg)
    {
        ConsoleHelper.writeMessage(String.format("Start cooking - %s, cooking time %dmin", arg.toString(), ((Order) arg).getTotalCookingTime()));
        setChanged();
        notifyObservers(arg);
    }
}
