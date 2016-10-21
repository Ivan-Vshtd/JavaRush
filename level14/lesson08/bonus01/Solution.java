package com.javarush.test.level14.lesson08.bonus01;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            List<String> list = new ArrayList<String>();
            list.get(12);

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {int[] i = new int[5];
            for(int j=0; j<=6; j++) {
                i[j] = (j+1) * 10;
            }


        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {String s = "Vasja";
            int i = Integer.parseInt(s);


        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {int[] i = new int[-5];


        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            FileWriter writer = new FileWriter("C:\\SomeDir\\notes3.txt");


        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {Object x = new Integer(0);
            System.out.println((String)x);



        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            Object szStr[] = new String[10];
            szStr[0] = new Character('*');

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            int[] nNulArray = new int[5];
            nNulArray = null;
            int i = nNulArray.length;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {String szShortString = "123";
            char chr = szShortString.charAt(10);


        } catch (Exception e)
        {
            exceptions.add(e);
        }
      /*  try
        {throw new IllegalStateException("Мое исключение"); 11 исключение на всякий случай


        } catch (Exception e)
        {
            exceptions.add(e);
        }
*/


        //Add your code here

    }
}
