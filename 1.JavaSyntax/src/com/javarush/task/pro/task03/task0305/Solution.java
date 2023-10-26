package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        int n1 = sc1.nextInt();
        int n2 = sc2.nextInt();
        int n3 = sc3.nextInt();

        if(n1 == n2 && n1 == n3 && n2 == n3) {
            System.out.print(n1 + " " + n2 + " " + n3);
        } else if(n1 == n2) {
            System.out.println(n1 + " " + n2);
        } else if (n2 == n3) {
            System.out.println(n2 + " " + n3);
        } else if (n1 == n3) {
            System.out.println(n1 + " " + n3);
        }
    }
}
