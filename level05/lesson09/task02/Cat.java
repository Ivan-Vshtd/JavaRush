package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private String catdata = null;
    public Cat(String name)
    {
        this.catdata =name;
    }
    public Cat(String name, int weight,int age)
    {
        this.catdata = name+weight+age;
    }
    public Cat(String name, int age)
    {
        this.catdata = name+age;
    }
    public Cat(int weight, String color)
    {
        this.catdata = weight+color;
    }
    public Cat(int weight, String color, int addr)
    {
        this.catdata = weight+color+addr;
    }//напишите тут ваш код

}
