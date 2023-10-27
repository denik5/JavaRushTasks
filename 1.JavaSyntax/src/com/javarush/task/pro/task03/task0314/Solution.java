package com.javarush.task.pro.task03.task0314;

import java.util.Scanner;

/* 
Сломанная клавиатура
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();

        if(str1.equalsIgnoreCase(secret)) System.out.println("доступ разрешен");
        else System.out.println("доступ запрещен");
    }
}
