package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a= reader.readLine();
        int b = Integer.parseInt(a);
        if (b>0)
        {b=b*2;
        System.out.print(b);}//напишите тут ваш код
else if(b<0)
        {
            b=b+1;
            System.out.print(b);
        }
    }

}