package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        String c = reader.readLine();
        int d = Integer.parseInt(a);
        int e = Integer.parseInt(b);
        int f = Integer.parseInt(c);
        if (d<0 && e<0 && f<0)
        {System.out.println("количество отрицательных чисел: 3");
        System.out.println("количество положительных чисел: 0");}
        else if ((d>0 && e<0 && f<0) || (d<0 && e>0 &&f<0) || (d<0 && e<0 && f>0))
        {System.out.println("количество отрицательных чисел: 2");
        System.out.println("количество положительных чисел: 1");}
        else if (d>0 && e>0 && f>0)
        {System.out.println("количество отрицательных чисел: 0");
        System.out.println("количество положительных чисел: 3");}
        else
        {System.out.println("количество отрицательных чисел: 1");
        System.out.println("количество положительных чисел: 2");}//напишите тут ваш код

    }
}
