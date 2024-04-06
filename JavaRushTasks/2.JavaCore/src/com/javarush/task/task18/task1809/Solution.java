package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();

        try (FileInputStream fileInputStream = new FileInputStream(file1);
             FileOutputStream fileOutputStream = new FileOutputStream(file2)) {

            List<Integer> list = new ArrayList<>();
            while (fileInputStream.available() > 0) {
                list.add(fileInputStream.read());
            }
            Collections.reverse(list);
            for (Integer aByte : list) {
                fileOutputStream.write(aByte);
            }
        }
    }
}
