package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        int maximum = Integer.parseInt(reader.readLine());
        int num;
        for (int i = 1;i<count;i++) {
            num = Integer.parseInt(reader.readLine());
            maximum = maximum > num ? maximum: num;
        }
        System.out.println(maximum);
    }
}
