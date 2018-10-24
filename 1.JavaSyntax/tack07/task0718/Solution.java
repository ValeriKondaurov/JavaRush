package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sr = new Scanner(System.in);
        ArrayList <String> list = new ArrayList<>();
        for (int  i = 0; i<10; i++) {
            list.add(sr.nextLine());
        }
        int index = 0;
        int i = 1;
        while ((index == 0) & (i<list.size())) {
            if (list.get(i).length() < list.get(i-1).length()) index = i;
            i++;
        }
        if (index>0) System.out.println(index);
    }
}

