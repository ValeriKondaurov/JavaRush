package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);
        int m = scr.nextInt();
        int n = scr.nextInt();
        for (int i = 0; i<m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(8);
            System.out.println("");
        }
    }
}
