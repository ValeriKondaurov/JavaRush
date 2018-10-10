package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String sNum = r.readLine();
        int num = Integer.parseInt(sNum);
        if (num>0 && num <1000) {
            if ((num / 10 < 1) && ((num % 2) == 0)) System.out.println("четное однозначное число");
            else if ((num / 10 < 1) && !((num % 2) == 0)) System.out.println("нечетное однозначное число");

            else if ((num / 10 < 10) && ((num % 2) == 0)) System.out.println("четное двузначное число");
            else if ((num / 10 < 10) && !((num % 2) == 0)) System.out.println("нечетное двузначное число");

            else if ((num / 10 < 100) && ((num % 2) == 0)) System.out.println("четное трехзначное число");
            else if ((num / 10 < 100) && !((num % 2) == 0)) System.out.println("нечетное трехзначное число");
        }
    }
}
