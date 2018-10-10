package com.javarush.task.task04.task0428;

/* 
Положительное число
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
        int i =0;

        if (a>0) i+=1;
        if (b>0) i+=1;
        if (c>0) i+=1;

        System.out.println(i);

    }
}
