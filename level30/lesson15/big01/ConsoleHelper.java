package com.javarush.test.level30.lesson15.big01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 20.07.2016.
 */
public class ConsoleHelper
{
   private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message)
    {
        System.out.println(message);
    }
    public static String readString()
    { String s=null;
        while (s==null)
        try
        {
          s= reader.readLine();
        }
        catch (IOException e)
        {
            writeMessage("Произошла ошибка при попытке ввода текста. Попробуйте еще раз.");

        }
        return s;
    }
    public static int readInt()
    {int x=0;
        while(true)
        try
        {
            x= Integer.parseInt(readString());
            break;
        }
        catch (NumberFormatException e)
        {
            writeMessage("Произошла ошибка при попытке ввода числа. Попробуйте еще раз.");

        }
        return x;
    }
}
