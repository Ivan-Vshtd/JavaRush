package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Map<Byte,Integer> letters = new HashMap<Byte, Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();
        FileInputStream in = new FileInputStream(new File(file));
        byte[] buffer = new byte[in.available()];
        int count1 = 0;
        if (in.available() > 0) {
            in.read(buffer);
            count1++;
        }
        in.close();
        for(byte c:buffer) {
            int count = 0;
            for(byte c1:buffer)
            {
                if(c == c1)
                    count++;
            }
            letters.put(c, count);
        }
        int Minbyte = count1;
        for(Map.Entry<Byte, Integer> pair :letters.entrySet())
        {
            if (pair.getValue() < Minbyte)
                Minbyte = pair.getValue();
        }
        for(Map.Entry<Byte, Integer> pair :letters.entrySet())
        {
            if (pair.getValue().equals(Minbyte))
                System.out.print(pair.getKey()+ " ");
        }
    }
}