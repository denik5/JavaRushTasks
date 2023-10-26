package com.javarush.task.pro.task03.task0311;

import java.util.Scanner;

/* 
Высокая точность
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        double a = sc1.nextDouble();
        double b = sc2.nextDouble();

        if (Math.abs(b - a) < 0.000001)
            System.out.println("числа равны");

        else System.out.println("числа не равны");
    }
}
