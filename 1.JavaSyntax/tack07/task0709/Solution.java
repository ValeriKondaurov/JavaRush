package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<String>();
        Scanner sr = new Scanner(System.in);
        String stemp = sr.nextLine();
        int min = stemp.length();
        strings.add(stemp);
        for (int i = 0; i <4; i++) {
            stemp = sr.nextLine();
            if (stemp.length() <min) min = stemp.length();
            strings.add(stemp);
        }

        for (String s:strings) {
            if (s.length()==min) System.out.println(s);
        }
    }
}
