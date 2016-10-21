package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args)throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream out = new FileOutputStream(new File(reader.readLine()));
        FileInputStream in2 = new FileInputStream(new File(reader.readLine()));
        FileInputStream in3 = new FileInputStream(new File(reader.readLine()));
        while(in2.available() > 0){
            byte[] res = new byte[in2.available()];
            int count = in2.read(res);

            out.write(res, 0, count);
        }
        while(in3.available() > 0){
            byte[] res = new byte[in3.available()];
            int count = in3.read(res);

            out.write(res, 0, count);
        }
        reader.close();
        out.close();
        in2.close();
        in3.close();


    }
}
