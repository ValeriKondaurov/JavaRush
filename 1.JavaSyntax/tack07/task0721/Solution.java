package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;
        int [] arr = new int[20];
        arr[0] = Integer.parseInt(reader.readLine());
        maximum = minimum = arr[0];
        for (int  i=1;i<20;i++) {
            arr[i] = Integer.parseInt(reader.readLine());
            if (arr[i]>maximum) maximum = arr[i];
                    else if (arr[i]<minimum) minimum= arr[i];
        }
        System.out.print(maximum + " " + minimum);
    }
}
