package com.javarush.task.task14.task1409;

/* 
Мосты
*/

public class Solution {
    public void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    public static void println(Bridge waterbridge) {
        System.out.println(waterbridge.getCarsCount());
    }
}

