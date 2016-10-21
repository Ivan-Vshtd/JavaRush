package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String dogdata= null;
    public Dog(String name)
    {
        this.dogdata = name;
    }
    public Dog(String name,int height)
    {
        this.dogdata = name + height;
    }
    public Dog(String name,int height, String color)
    {
        this.dogdata = name+height+color;
    }//напишите тут ваш код

}
