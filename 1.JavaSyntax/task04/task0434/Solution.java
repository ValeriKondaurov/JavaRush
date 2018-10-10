package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int i =0, j = 0;
        while (i<10) {
            i++;
            while (j<10) {
                j++;
                System.out.print(i * j + " ");
            }
            j =0;
            System.out.println();
        }
    }
}
