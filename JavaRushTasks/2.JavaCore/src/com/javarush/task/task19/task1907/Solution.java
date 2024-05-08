package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
*/

public class Solution {
    public static int counter = 0;

    public static void main(String[] args) throws IOException {
        String fName;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            fName = bufferedReader.readLine();
        }
        StringBuilder text = new StringBuilder();
        try (FileReader reader = new FileReader(fName)) {
            char currentChar;
            while (reader.ready()) {
                currentChar = (char) reader.read();
                text.append(currentChar);
            }
        }
        String replacedString = text.toString().replaceAll("\\p{P}", " ").replaceAll("\\s", " ");
        for (String vs : replacedString.split(" ")) {
            if (vs.equals("world")) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
