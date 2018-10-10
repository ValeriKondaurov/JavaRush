package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int num = 0 ;
        String sNum;
        while (num !=-1) {
            sNum = br.readLine();
            num = Integer.parseInt(sNum);
            sum = sum + num;
        }
        System.out.println(sum);
    }
}
