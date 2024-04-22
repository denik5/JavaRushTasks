package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        reset();
    }

    public static CanFly result;

    public static void reset() throws IllegalArgumentException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = bufferedReader.readLine();
            if ("plane".equals(line)) {
                line = bufferedReader.readLine();
                result = new Plane(Integer.parseInt(line));
            } else if ("helicopter".equals(line)) {
                result = new Helicopter();
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
