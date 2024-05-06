package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        String fileName = args[0];

        ArrayList<String> fileContent = new ArrayList<>();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            String fileLine;
            while ((fileLine = fileReader.readLine()) != null)
                fileContent.add(fileLine);
        } catch (IOException ignore) {

        }
        for (String fileLine : fileContent) {
            String[] stringArray = fileLine.split(" ");
            StringBuffer name = new StringBuffer();

            for (int i = 0; i < stringArray.length - 3; i++) {
                name.append(stringArray[i]).append(" ");
            }
            int year = Integer.parseInt(stringArray[stringArray.length -1]);
            int month = Integer.parseInt(stringArray[stringArray.length -2]) - 1;
            int day = Integer.parseInt(stringArray[stringArray.length -3]);

            Calendar birthday = new GregorianCalendar(year, month, day);

            PEOPLE.add(new Person(name.toString().trim(), birthday.getTime()));
        }
    }
}
