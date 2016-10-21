package com.javarush.test.level27.lesson15.big01.kitchen;

import com.javarush.test.level27.lesson15.big01.ConsoleHelper;
import com.javarush.test.level27.lesson15.big01.Tablet;

import java.io.IOException;
import java.util.List;

/**
 * Created by user on 11.07.2016.
 */
public class Order
{
    protected List<Dish> dishes;
    private Tablet tablet;
    private int cookingTime;

    public Order(Tablet tablet)throws IOException
    {
        this.tablet = tablet;
        this.dishes = ConsoleHelper.getAllDishesForOrder();

    }

    @Override
    public String toString()
    {
        return dishes.isEmpty() ? "" : "Your order: " + dishes + " of Tablet{" + "number=" + tablet.getNumber() +'}';
    }
    public boolean isEmpty() {
        return dishes.isEmpty();
    }

    public List<Dish> getDishes()
    {
        return dishes;
    }

    public Tablet getTablet()
    {
        return tablet;
    }
    public int getTotalCookingTime()
    {
        cookingTime = 0;
        for (Dish dish : dishes) {
            cookingTime += dish.getDuration();
        }
        return cookingTime;
    }
}
