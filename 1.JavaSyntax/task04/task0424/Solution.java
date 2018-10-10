package com.javarush.task.task04.task0424;

/* 
Три числа
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
        if ((a==b) & !(a==c)) System.out.println(3);
        else if ((a==c) & !(a==b)) System.out.println(2);
        else if ((c==b) & !(a==c)) System.out.println(1);

    }
}
