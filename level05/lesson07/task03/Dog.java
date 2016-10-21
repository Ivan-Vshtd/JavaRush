package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String Dogname = null;
    public void initialize(String name)
    {
        this.Dogname =name;
    }
    public void initialize(String name,int height)
    {
        this.Dogname =name+height;
    }
    public void initialize(String name,int height,String color)
    {
        this.Dogname =name+height+color;
    }//напишите тут ваш код

}
