package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[20];
        for (int i = 0; i < a.length; i++)
            a[i] = Integer.parseInt(reader.readLine());

        int[] b1 = new int[10];
        int[] b2 = new int[10];
        for (int i = 0; i < b1.length; i++) {
            b1[i] = a[i];
            b2[i] = a[i + 10];
            System.out.println(b2[i]);
        }

    }
}
