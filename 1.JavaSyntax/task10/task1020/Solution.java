package com.javarush.task.task10.task1020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);
        /*for (int i = 0; i<array.length; i++)
            System.out.println(i+ "ый элемент после сортировки - " + array[i]);*/
        System.out.println(array[9]);
        System.out.println(array[10]);
    }

    public static void sort(int[] array) {
        for (int i = 0; i< array.length; i++) {
            boolean flag = true;
            for (int j = 0; j<array.length - (i+1); j++) {
                if (array[j] > array[j+1]) {
                flag = false;
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
                }
            }
            if (flag) break;
        }
    }
}
