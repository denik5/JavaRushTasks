package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        Scanner str1 = new Scanner(System.in);
        String name1 = str1.nextLine();
        Scanner str2 = new Scanner(System.in);
        String name2 = str2.nextLine();
        Scanner str3 = new Scanner(System.in);
        String name3 = str3.nextLine();

        System.out.println(name3);
        System.out.println(name2.toUpperCase());
        System.out.println(name1.toLowerCase());

    }
}
