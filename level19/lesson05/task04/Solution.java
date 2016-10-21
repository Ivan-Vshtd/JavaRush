package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        FileReader fin1 = new FileReader(file1);
        FileWriter fin2 = new FileWriter(file2);
        while (fin1.ready()) //пока есть непрочитанные байты в потоке ввода
        {
            int data = fin1.read();
            if (data==46)
            {data=33;}
          //читаем один символ (char будет расширен до int)
            fin2.write(data); //пишем один символ (int будет обрезан/сужен до char)
        }
        fin1.close();
        fin2.close();
    }
}

