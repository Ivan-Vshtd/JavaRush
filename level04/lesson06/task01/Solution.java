package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String k = reader.readLine();
        int a = Integer.parseInt(s);
        int b = Integer.parseInt(k);
        if (a<b)
        System.out.print(a);
        else
            System.out.print(b);//напишите тут ваш код

    }
}