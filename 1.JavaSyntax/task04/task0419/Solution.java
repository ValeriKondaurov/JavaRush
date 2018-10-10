package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();
        int max = Integer.parseInt(s);
        s = r.readLine();
        if (Integer.parseInt(s)>max) max = Integer.parseInt(s);
        s = r.readLine();
        if (Integer.parseInt(s)>max) max = Integer.parseInt(s);
        s = r.readLine();
        if (Integer.parseInt(s)>max) max = Integer.parseInt(s);
        System.out.println(max);

    }
}
