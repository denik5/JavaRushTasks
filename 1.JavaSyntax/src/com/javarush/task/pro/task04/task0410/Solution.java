package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int i = sc.nextInt();
            if (i < min1) {
                min2 = min1;
                min1 = i;
            } else if (i < min2 && i != min1) {
                min2 = i;
            }
        }
        System.out.println(min2);
    }
}