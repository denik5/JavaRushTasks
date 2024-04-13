package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(4.0, "Hello");
        labels.put(1.0, "Merhaba");
        labels.put(4.9, "Gutten tag");
        labels.put(0.0, "Привет");
        labels.put(0.5, "NiHao");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
