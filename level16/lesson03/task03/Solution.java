package com.javarush.test.level16.lesson03.task03;

import java.util.ArrayList;
import java.util.List;

/* Список и нити
В методе main добавить в статический объект list 5 нитей SpecialThread - различных объектов.
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        SpecialThread first =  new SpecialThread();
        SpecialThread second =  new SpecialThread();
        SpecialThread third =  new SpecialThread();
        SpecialThread forth =  new SpecialThread();
        SpecialThread fifs =  new SpecialThread();
        Thread thread1 = new Thread(first);
        Thread thread2 = new Thread(second);
        Thread thread3 = new Thread(third);
        Thread thread4 = new Thread(forth);
        Thread thread5 = new Thread(fifs);
        list.add(thread1);
        list.add(thread2);
        list.add(thread3);
        list.add(thread4);
        list.add(thread5);
       /* thread1.run();
        thread2.run();
        thread3.run();
        thread4.run();
        thread5.run();
*/
        //Add your code here - добавьте свой код тут
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's run method inside SpecialThread");
        }
    }
}
