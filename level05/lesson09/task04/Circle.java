package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    private String circledata = null;
    public Circle(String centerX, String centerY, String radius)
    {
        this.circledata = centerX+centerY+radius;
    }
    public Circle(String centerX, String centerY, String radius, String width)
    {
        this.circledata = centerX+centerY+radius+width;
    }
    public Circle(String centerX, String centerY, String radius, String width, String color)
    {
        this.circledata = centerX+centerY+radius+width+color;
    }//напишите тут ваш код

}
