package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer m = Integer.parseInt(reader.readLine());
        Integer n = Integer.parseInt(reader.readLine());
        ArrayList <String> list  = new ArrayList<>();
        for (int i = 0; i<m; i++) {
            list.add(reader.readLine());
        }

        String temp;
        for (int i = 0; i<n; i++) {
            temp = list.get(0);
            list.remove(0);
            list.add(temp);
        }
        for (String i:list) System.out.println(i);
    }
}
