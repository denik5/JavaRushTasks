package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, int b) {

    }
    public static void printMatrix(int m, int n, byte b) {

    }
    public static void printMatrix(int m, double n, int b) {

    }
    public static void printMatrix(float m, int n, int b) {

    }
    public static void printMatrix(short m, int n, int b) {

    }
    public static void printMatrix(int m, char n, int b) {

    }
    public static void printMatrix(int m, int n, char b) {

    }
    public static void printMatrix(int m, int n,  double b) {

    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
