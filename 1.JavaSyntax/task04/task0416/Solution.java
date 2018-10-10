package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String sMin = r.readLine();
        float min = Float.parseFloat(sMin);
        if (min % 5<3) System.out.println("зелёный");
        else if (min % 5<4) System.out.println("жёлтый");
        else System.out.println("красный");

    }
}