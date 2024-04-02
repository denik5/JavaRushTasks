package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fName = bufferedReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fName);

        int counter = 0;
        while (fileInputStream.available() > 0) {
            if (fileInputStream.read()==(byte)',') counter++;
        }
        fileInputStream.close();
        System.out.println(counter);
    }
}
