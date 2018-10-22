package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[15];
        for (int i = 0; i < a.length; i++)
            a[i] = Integer.parseInt(reader.readLine());
        int count_even=0;
        int count_odd=0;

        for (int i = 0; i < a.length; i++)
            if ((i) % 2 == 0) count_even+= a[i];
                    else count_odd+=a[i];

        if (count_even>count_odd)
        System.out.println("В домах с четными номерами проживает больше жителей.");
        else System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
