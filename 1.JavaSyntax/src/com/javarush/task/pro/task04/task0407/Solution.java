package com.javarush.task.pro.task04.task0407;

/* 
Сумма чисел, не кратных 3
*/

public class Solution {
    public static void main(String[] args) {
        int n = 0;
        int sum = 0;

        while (n <= 100) {
            if (n % 3 == 0) {
                n++;
                continue;
            }
            sum = sum + n;
            n++;
        }
        System.out.println(sum);
    }
}