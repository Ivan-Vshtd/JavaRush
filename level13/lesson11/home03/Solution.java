package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args)throws IOException
    {BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        InputStream inStream = new FileInputStream(reader.readLine());
        //int data = 0;
        while (inStream.available() > 0)
        {
            //data = inStream.read();
            System.out.print((char)inStream.read());//add your code here
        }

        inStream.close();
        //reader.close();
    }
}
