package com.javarush.test.level18.lesson03.task01;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream input = new FileInputStream(reader.readLine());
        reader.close();
        int max = input.read();
        while (input.available() > 0)
        {
            int data = input.read();
            if (data > max)
                max = data;
        }
        input.close();
        System.out.println(max);//выводим сумму на экран.
    }
    }

