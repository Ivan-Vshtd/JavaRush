package com.javarush.test.level07.lesson06.task01;

import java.util.ArrayList;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {ArrayList<String> list = new ArrayList<String>();
       list.add(0,"Vanja1");
        list.add(1,"Vanja2");
        list.add(2,"Vanja3");
        list.add(3,"Vanja4");
        list.add(4,"Vanja5");
        int n = list.size();
        System.out.println(n);
        for(int i=0;i<5;i++)
        {
            System.out.println(list.get(i));
        }


        //напишите тут ваш код

    }
}
