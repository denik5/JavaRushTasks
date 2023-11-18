package com.javarush.task.pro.task08.task0803;

import java.util.Arrays;
import java.util.Scanner;

/* 
Минимальный элемент массива
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
        System.out.println(Arrays.toString(intArray));
    }

    public static int min(int[] ints) {
        int min = Integer.MAX_VALUE;
        for (int i : ints) {
            min = Math.min(i, min);
        }
        return min;
    }

    public static int[] getArrayOfTenElements() {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            int a = sc.nextInt();
            array[i] = a;
        }
        return array;
    }
}
