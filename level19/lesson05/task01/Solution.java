package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
Закрыть потоки ввода-вывода.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader file1 = new FileReader(reader.readLine());
        FileWriter file2 = new FileWriter(reader.readLine());
        while (file1.ready()) //пока есть непрочитанные байты в потоке ввода
        {
            int data1 = file1.read();
            int data2 = file1.read();//читаем один символ (char будет расширен до int)
            file2.write(data2); //пишем один символ (int будет обрезан/сужен до char)
        }
        reader.close();
        file1.close();
        file2.close();


    }
}
