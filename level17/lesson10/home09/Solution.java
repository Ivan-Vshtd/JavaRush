package com.javarush.test.level17.lesson10.home09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Транзакционность
Сделать метод joinData транзакционным, т.е. если произошел сбой, то данные не должны быть изменены.
1. Считать с консоли 2 имени файла
2. Считать построчно данные из файлов. Из первого файла - в allLines, из второго - в forRemoveLines
В методе joinData:
3. Если список allLines содержит все строки из forRemoveLines, то удалить из списка allLines все строки, которые есть в forRemoveLines
4. Если список allLines НЕ содержит каких-либо строк, которые есть в forRemoveLines, то
4.1. очистить allLines от данных
4.2. выбросить исключение CorruptedDataException
Метод joinData должен вызываться в main. Все исключения обработайте в методе main.
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();
    public static void main(String[] args) throws IOException
    {
        String fileName1, fileName2;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        fileName1 = reader.readLine();
        fileName2 = reader.readLine();
        reader.close();

        BufferedReader reader1 = new BufferedReader(new FileReader(fileName1));
        String line = null;
        while ((line = reader1.readLine()) != null)
        {
            allLines.add(line);
        }
        reader1.close();

        BufferedReader reader2 = new BufferedReader(new FileReader(fileName2));
        line = null;
        while ((line = reader2.readLine()) != null)
        {
            forRemoveLines.add(line);
        }
        reader2.close();

        new Solution().joinData();
    }



    public void joinData () throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines) ) {
            allLines.removeAll(forRemoveLines)  ;
            return;
        }

        for (String s : forRemoveLines) {
            if (!allLines.contains(s)){
                allLines.clear();
                throw  new CorruptedDataException();
            }

        }
    }
}
