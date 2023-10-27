package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Сравним строки
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String str1 = sc1.nextLine();
        String str2 = sc2.nextLine();

        if(str1.equals(str2)) System.out.println("строки одинаковые");
        else System.out.println("строки разные");
    }
}
