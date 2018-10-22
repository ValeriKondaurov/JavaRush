package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<String>();
        Scanner sr = new Scanner(System.in);
        String stemp;
        int max = 0;
        for (int i = 0; i <5; i++) {
            strings.add(sr.nextLine());
        }
        for (String s:strings) {
            if (s.length() > max) max = s.length() ;
        }

        for (String s:strings) {
            if (s.length()==max) System.out.println(s);
        }
    }
}
