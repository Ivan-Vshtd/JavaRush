package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    public static void main(String[] args) {
        System.out.println(labels);
    }
    static
    {labels.put(3.2,"sdf");
        labels.put(3.4,"sf");
        labels.put(4.2,"styty");
        labels.put(3.7,"erf");
        labels.put(5.2,"sertet");

    }
}
