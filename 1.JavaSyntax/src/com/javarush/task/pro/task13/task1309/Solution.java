package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Александр Мельников", 3.9);
        grades.put("Анатолий Иванов", 4.4);
        grades.put("Фомин Игорь", 4.9);
        grades.put("Данилл Брянов", 2.9);
        grades.put("Демид Резин", 4.5);
    }
}
