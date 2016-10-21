package com.javarush.test.level14.lesson06.home01;

/**
 * Created by user on 31.03.2016.
 */
public class MoldovanHen extends Hen
{
    public int getCountOfEggsPerMonth()
    {
        return 28;
    }
   public String getDescription()
    {
        return super.getDescription()+" Моя страна - "+Country.MOLDOVA +". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

}
