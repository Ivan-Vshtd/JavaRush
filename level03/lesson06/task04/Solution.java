package com.javarush.test.level03.lesson06.task04;

/* Экранирование символов
Про экранирование символов в Java читайте в дополнительном материале к лекции.
Вывести на экран следующий текст - две строки:

It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
It's Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"
*/

public class Solution
{
    public static void main(String[] args)
    {
        String x = "\\";
        String y = "\"";
        System.out.println("It's Windows path: " + y + "C:" + x + "Program Files" + x + "Java" + x + "jdk1.7.0" + x + "bin" + y);
        System.out.println("It's Java string: " + x + y + "C:" + x + x + "Program Files" + x + x + "Java" + x + x + "jdk1.7.0" + x + x + "bin" + x + y);//напишите тут ваш код

    }
}