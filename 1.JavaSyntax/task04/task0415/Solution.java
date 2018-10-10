package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();
        int a = Integer.parseInt(s);
        s = r.readLine();
        int b = Integer.parseInt(s);
        s = r.readLine();
        int c = Integer.parseInt(s);
        if ((c<a+b) & (a<b+c)& (b<a+c)) System.out.println("Треугольник существует.");
        else System.out.println("Треугольник не существует.");

    }
}