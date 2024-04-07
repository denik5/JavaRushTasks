package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
             BufferedReader reader = new BufferedReader(inputStreamReader);) {

            List<Integer> list = new ArrayList<>();
            while (reader.ready()) {
                String number = reader.readLine();
                int index = Integer.parseInt(number);
                if (index % 2 == 0) {
                    list.add(index);
                }
            }
            list.stream().sorted().forEach(System.out::println);
        }
    }
}
