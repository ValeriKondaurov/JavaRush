package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
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
        int positive =0;
        int negative =0;

        if (a>0) positive+=1;
        else if (a<0) negative+=1;
        if (b>0) positive+=1;
        else if (b<0) negative+=1;
        if (c>0) positive+=1;
        else if (c<0) negative+=1;

        System.out.println("количество отрицательных чисел: " + negative);
        System.out.println("количество положительных чисел: " + positive);

    }
}
