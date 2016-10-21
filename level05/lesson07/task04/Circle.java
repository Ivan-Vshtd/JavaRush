package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    private String Circless = null;
    public void initialize(int centerX,int centerY,String radius)
    {
        this.Circless = centerX+centerY+radius;
    }
    public void initialize(int centerX,int centerY,String radius,String width)
    {
        this.Circless = centerX+centerY+radius+width;
    }
    public void initialize(int centerX,int centerY,String radius,String width, int color)
    {
        this.Circless = centerX+centerY+radius+width+color;
    }//напишите тут ваш код

}
