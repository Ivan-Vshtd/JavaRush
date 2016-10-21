package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
       String name;
        String surename;
        int age;
        String sex;
        float height;
        double weight;
        Human(String name,String surename)
        {
            this.name = name;
            this.surename = surename;


        }
        Human(String name,String surename,int age)
        {
            this.name = name;
            this.surename = surename;
            this.age = age;


        }
        Human(String name,String surename,int age,String sex)
        {
            this.name = name;
            this.surename = surename;
            this.age = age;
            this.sex = sex;


        }
        Human(String name,String surename,int age,String sex,float height)
        {
            this.name = name;
            this.surename = surename;
            this.age = age;
            this.sex = sex;
            this.height = height;



        }
        Human(String name,String surename,int age,String sex,float height,float weight)
        {
            this.name = name;
            this.surename = surename;
            this.age = age;
            this.sex = sex;
            this.height = height;
            this.weight = weight;


        }

        Human(String name,String surename,String sex,float height,float weight)
        {
            this.name = name;
            this.surename = surename;
            this.sex = sex;
            this.height = height;
            this.weight = weight;


        }
        Human(String name,String surename,int age,float height,float weight)
        {
            this.name = name;
            this.surename = surename;
            this.age = age;
            this.height = height;
            this.weight = weight;


        }
        Human(String name,String surename,int age,String sex,int weight)
        {
            this.name = name;
            this.surename = surename;
            this.age = age;
            this.sex = sex;
            this.weight = weight;


        }
        Human(String name,String surename,int age,String sex,double weight)
        {
            this.name = name;
            this.surename = surename;
            this.age = age;
            this.sex = sex;
            this.weight = weight;


        }
        Human(String name,String surename,int age,String sex,int height,int weight)
        {
            this.name = name;
            this.surename = surename;
            this.age = age;
            this.sex = sex;
            this.height = height;
            this.weight = weight;


        }





        //напишите тут ваши переменные и конструкторы
    }
}
