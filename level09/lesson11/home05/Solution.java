package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String texst = reader.readLine();
        char[] charArray = texst.toCharArray();
        ArrayList <Character> listCharVowels = new ArrayList <Character>(); //список для гласных
        ArrayList <Character> listCharNonVowels = new ArrayList<Character>(); //список для согласных

        for (int i=0; i < charArray.length; i++) //бежим по массиву
        {
            if (isVowel(charArray[i])) //&#x43f;&#x440;&#x43e;&#x432;&#x435;&#x440;&#x44f;&#x435;&#x43c; &#x443;&#x441;&#x43b;&#x43e;&#x432;&#x438;&#x435; &#x43c;&#x435;&#x442;&#x43e;&#x434;&#x43e;&#x43c; isVowel &#x435;&#x441;&#x43b;&#x438; &#x442;&#x435;&#x43a;&#x443;&#x448;&#x438;&#x439; &#x441;&#x438;&#x43c;&#x432;&#x43e;&#x43b; &#x433;&#x43b;&#x430;&#x441;&#x43d;&#x430;&#x44f;
            {
                listCharVowels.add(charArray[i]); //помещаем гласную в свой список
            }
            else if (charArray [i] == ' ')// проверяем есть ли пробел, и пропускаем его
            {
                continue;
            }
            else
            {
                listCharNonVowels.add(charArray[i]); //остальные буквы или другие символы(точка например), помещаем в свой список
            }
        }

        for (char c : listCharVowels)//бежим по списку, в который положили гласные
        {
            System.out.print(c + " "); //выводи гланые на экран, не забываем пробел между ними
        }

        System.out.println(); // переводим курсов на другую строчку

        for (char c : listCharNonVowels) //бежим по списку согласных
        {
            System.out.print(c + " "); //выводим на экран все остальные символы, через пробел
        }


    }



    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
