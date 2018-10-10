package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
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
        if (c>=b & b>=a) System.out.println(c + " " + b + " " + a);
        else if (c>=a & a>=b) System.out.println(c + " " + a + " " + b);

        else if (b>=c & c>=a) System.out.println(b + " " + c + " " + a);
        else if (b>=a & a>=c) System.out.println(b + " " + a + " " + c);

        else if (a>=b & b>=c) System.out.println(a + " " + b + " " + c);
        else if (a>=c & c>=b) System.out.println(a + " " + c + " " + b);

    }
}
