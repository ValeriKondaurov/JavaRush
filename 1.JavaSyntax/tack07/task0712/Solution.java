package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<String>();
        Scanner sr = new Scanner(System.in);
        String stemp = sr.nextLine();
        int min = stemp.length();
        int max = stemp.length();
        strings.add(stemp);
        for (int i = 0; i <9; i++) {
            stemp = sr.nextLine();
            if (stemp.length() <min) min = stemp.length();
                    else if (stemp.length() >max) max = stemp.length();
            strings.add(stemp);
        }
        int i=0;
        while (!(strings.get(i).length() == min) & !(strings.get(i).length() == max)) {
            i++;
        }
        System.out.println(strings.get(i));
    }
}
