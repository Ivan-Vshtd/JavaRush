package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
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
        if (d!=e && e==f)
        System.out.print(1);
        else if(e!=f && d==f)
            System.out.print(2);
        else if(d!=f && d==e)
            System.out.print(3);//напишите тут ваш код

    }
}
