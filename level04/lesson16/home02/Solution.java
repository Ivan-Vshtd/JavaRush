package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        String c = reader.readLine();
        int d = Integer.parseInt(a);
        int e = Integer.parseInt(b);
        int f = Integer.parseInt(c);
        if((d<e && e<f)|| (f<e && e<d))
            System.out.print(e);
        else if((e<d && d<f) || (f<d && d<e))
            System.out.print(d);
        else if((e<f && f<d) || (d<f && f<e))
            System.out.print(f);

        //напишите тут ваш код
    }
}
