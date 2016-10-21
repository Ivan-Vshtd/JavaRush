package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution
{
    public static void main(String[] args)
    {int a=1,b=2,c=3,d=4,e=5,f=6,g=7,h=8,i=9,k=10;
        System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h+" "+i+" "+k);
        System.out.println(b+" "+b*b+" "+b*c+" "+b*d+" "+b*e+" "+b*f+" "+b*g+" "+b*h+" "+b*i+" "+b*k);
        System.out.println(c+" "+c*b+" "+c*c+" "+c*d+" "+c*e+" "+c*f+" "+c*g+" "+c*h+" "+c*i+" "+c*k);
        System.out.println(d+" "+d*b+" "+d*c+" "+d*d+" "+d*e+" "+d*f+" "+d*g+" "+d*h+" "+d*i+" "+d*k);
        System.out.println(e+" "+e*b+" "+e*c+" "+e*d+" "+e*e+" "+e*f+" "+e*g+" "+e*h+" "+e*i+" "+e*k);
        System.out.println(f+" "+f*b+" "+f*c+" "+f*d+" "+f*e+" "+f*f+" "+f*g+" "+f*h+" "+f*i+" "+f*k);
        System.out.println(g+" "+g*b+" "+g*c+" "+g*d+" "+g*e+" "+g*f+" "+g*g+" "+g*h+" "+g*i+" "+g*k);
        System.out.println(h+" "+h*b+" "+h*c+" "+h*d+" "+h*e+" "+h*f+" "+h*g+" "+h*h+" "+h*i+" "+h*k);
        System.out.println(i+" "+i*b+" "+i*c+" "+i*d+" "+i*e+" "+i*f+" "+i*g+" "+i*h+" "+i*i+" "+i*k);
        System.out.println(k+" "+k*b+" "+k*c+" "+k*d+" "+k*e+" "+k*f+" "+k*g+" "+k*h+" "+k*i+" "+k*k);
        //напишите тут ваш код

    }
}