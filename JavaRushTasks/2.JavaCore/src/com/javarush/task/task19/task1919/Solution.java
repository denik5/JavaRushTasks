package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) {
        TreeMap<String, Double> salary = new TreeMap<>();
        String fname = args[0];

        try (BufferedReader rd = new BufferedReader(new FileReader(fname))) {
            String[] splitLine;
            String line;
            Double value;

            while ((line = rd.readLine()) != null) {
                splitLine = line.split(" ");
                String name = splitLine[0];
                double valueC = Double.parseDouble(splitLine[1]);

                if (salary.containsKey(name)) {
                    value = salary.get(name);
                    salary.put(name, value + valueC);
                } else {
                    salary.put(name, valueC);
                }
            }
        } catch (IOException e) {

        }
        for (String key : salary.keySet()) {
            System.out.println(key + " " + salary.get(key));
        }
    }
}
