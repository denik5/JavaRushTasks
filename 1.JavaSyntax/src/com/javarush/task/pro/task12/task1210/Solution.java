package com.javarush.task.pro.task12.task1210;

import java.util.ArrayList;

/* 
Переворачивание данных
*/

public class Solution {
    public static ArrayList<Integer> numbers = new ArrayList<Integer>();

    public static void main(String[] args) {
        init();
        print();

        reverse();
        print();
    }

    public static void init() {
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
    }

    public static void reverse() {
        int n = numbers.size();
        for (int i = n - 1; i >=0; i--) {
            numbers.add(numbers.get(i));
            numbers.remove(i);
        }
    }

    private static void print() {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
