package com.javarush.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Максимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int max = Integer.MIN_VALUE;
        array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = sc.nextInt();
            max = (max<array[i])?array[i]:max;
        }
        System.out.println(max);
    }
}
