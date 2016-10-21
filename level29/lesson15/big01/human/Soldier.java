package com.javarush.test.level29.lesson15.big01.human;

/**
 * Created by user on 09.08.2016.
 */
public class Soldier extends Human
{
    public Soldier(String name, int age)
    {
        super(name, age);
    }


@Override
    public void live() {

            fight();
    }
    public void fight() {
    }
}
