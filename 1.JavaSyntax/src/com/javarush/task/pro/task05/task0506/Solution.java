package com.javarush.task.pro.task05.task0506;

import java.lang.reflect.Array;
import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(sc.nextLine());
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            int number  = array[i];
            if(number < min) {
                min = number;
        }
    }
        System.out.println(min);
}
    }

