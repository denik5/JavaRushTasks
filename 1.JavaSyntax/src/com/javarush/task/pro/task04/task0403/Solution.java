package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isEnter = false;
        int sum = 0;

        while (!isEnter) {
            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                sum = sum + num;
            } else if (sc.hasNextInt()) {
                String line = sc.nextLine();
                if (line.equals("ENTER")) {
                    isEnter = true;
                }
            }
        }
           System.out.println(sum);
        }
    }
