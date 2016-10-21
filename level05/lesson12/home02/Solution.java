package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man man1 = new Man("Vanja",28,"Minsk");
        Man man2 = new Man("Dima",30,"Gomel");
        Woman woman1 = new Woman("Lena",26,"Brest");
        Woman woman2 = new Woman("Olja",24,"Vitebsk");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
        //создай по два объекта каждого класса тут

        //выведи их на экран тут
    }
    public static class Man
    {String name;
        int age;
        String address;
        //private String mandata = null;
        public Man(String name, int age,String address)
        {
            this.name = name;
            this.age=age;
            this.address=address;

        }
        public Man(String name, int age)
        {
            this.name = name;
            this.age=age;

        }
        public Man(String name)
        {
            this.name = name;

        }

        }


   public static class Woman
    {String name;
        int age;
        String address;
        //private String womandata = null;
        public Woman(String name, int age,String address)
        {
            this.name = name;
            this.age=age;
            this.address=address;
        }
        public Woman(String name, int age)
        {
            this.name = name;
            this.age=age;
        }
        public Woman(String name)
        {
            this.name = name;
        }


    }
}



    //добавьте тут ваши классы

