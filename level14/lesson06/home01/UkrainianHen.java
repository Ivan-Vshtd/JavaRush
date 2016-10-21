package com.javarush.test.level14.lesson06.home01;

/**
 * Created by user on 31.03.2016.
 */
public class UkrainianHen extends Hen
{
    public int getCountOfEggsPerMonth()
    {
        return 26;
    }
   public  String getDescription()
    {
        return super.getDescription()+" Моя страна - "+Country.UKRAINE +". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

}