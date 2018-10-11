package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner src = new Scanner(System.in);
        int count = 0;
        int num = 0;
        double sum = 0;

        while (true)
        {
            num = src.nextInt();
            if (num == -1) break;
            count++;
            sum += num;
        }

        System.out.println(sum/count);
    }
}

