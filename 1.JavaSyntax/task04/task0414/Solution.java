package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sYear = reader.readLine();
        int year = Integer.parseInt(sYear);
        int day = 0;
            if ((year % 100 == 0) & (year % 400 == 0)) day = 366;
                else if  ((year % 4 == 0) & (year % 100 != 0))  day = 366;
                    else day = 365;

        System.out.println("количество дней в году: " + day);
    }
}