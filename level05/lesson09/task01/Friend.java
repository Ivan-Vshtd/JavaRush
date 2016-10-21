package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    private String frienddata = null;
    public Friend(String name)
    {
        this.frienddata = name;
    }
    public Friend(String name,int age)
    {
        this.frienddata = name+age;
    }
    public Friend(String name, int age, int sex)
    {
        this.frienddata = name+age+sex;
    }//напишите тут ваш код

}