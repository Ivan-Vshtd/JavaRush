package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        String c = reader.readLine();
        int d = Integer.parseInt(a);
        int e = Integer.parseInt(b);
        int f = Integer.parseInt(c);
        if (d<0 && e<0 && f<0)
            System.out.print(0);
        else if ((d>0 && e<0 && f<0) || (d<0 && e>0 &&f<0) || (d<0 && e<0 && f>0))
            System.out.print(1);
                else if (d>0 && e>0 && f>0)
            System.out.print(3);
        else
            System.out.print(2);



        //напишите тут ваш код

    }
}
