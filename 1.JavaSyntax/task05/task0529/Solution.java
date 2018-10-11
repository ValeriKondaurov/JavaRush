package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        String txt = r.readLine();;
        while (!txt.contains("сумма")) {
            sum = sum + Integer.parseInt(txt);
            txt = r.readLine();
        }
        System.out.println(sum);
    }
}
