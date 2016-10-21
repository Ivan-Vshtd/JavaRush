package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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
        String d = reader.readLine();
        int f = Integer.parseInt(a);
        int g = Integer.parseInt(b);
        int h = Integer.parseInt(c);
        int k = Integer.parseInt(d);
        if (f>g && f>h &&f>k)
        System.out.print(f);
        else if (g>h &&g>k && g>f)
            System.out.print(g);
        else if (h>k && h>f && h>g)
            System.out.print(h);
        else
            System.out.print(k);

    }
}
