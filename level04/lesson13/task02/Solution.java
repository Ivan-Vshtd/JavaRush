package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);
        for (int i=c;i>0;i--)
        {
            {for (int k=d;k>0;k--)
                System.out.print("8");//напишите тут ваш код

            }
            System.out.println();
        }

    }
}
