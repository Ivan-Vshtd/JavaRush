package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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
        if (d>e && e>f)
            System.out.print (d+" "+e+" "+f);
        else if(e>f &&f>d)
            System.out.print (e+" "+f+" "+d);
        else if(f>d && d>e)
            System.out.print (f+" "+d+" "+e);
        else if(d>f && f>e)
            System.out.print (d+" "+f+" "+e);
        else if(e>d && d>f)
            System.out.print (e+" "+d+" "+f);
        else //if(f>e && e>d)
            System.out.print(f + " " + e + " " + d);

        //напишите тут ваш код

    }
}
