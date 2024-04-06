package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file = bufferedReader.readLine();

        int[] byteCount = new int[256];
        try (FileInputStream inputStreamReader = new FileInputStream(file)) {
            while (inputStreamReader.available() > 0) {
                byteCount[inputStreamReader.read()] += 1;
            }
        }
        int minCount = Integer.MAX_VALUE;
        for (int byteC : byteCount) {
            if (byteC > 0 && byteC < minCount) minCount = byteC;
        }
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < byteCount.length; i++) {
            if (byteCount[i]==minCount) resultList.add(i);
        }
        for (Integer resultItem : resultList) System.out.print(resultItem + " ");
    }
}
