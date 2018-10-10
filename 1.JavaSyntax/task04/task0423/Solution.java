package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String name = r.readLine();
        String sAge = r.readLine();
        if (Integer.parseInt(sAge) > 20) System.out.println("И 18-ти достаточно");
    }
}
