package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String name = r.readLine();
        String sAge = r.readLine();
        if (Integer.parseInt(sAge) < 18) System.out.println("Подрасти еще");
    }
}
