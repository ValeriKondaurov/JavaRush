package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList <Integer> gen = new ArrayList<>();
        ArrayList <Integer> arr3 = new ArrayList<>();
        ArrayList <Integer> arr2 = new ArrayList<>();
        ArrayList <Integer> other = new ArrayList<>();
        Scanner sr = new Scanner(System.in);
        for (int i = 0; i<20; i++) {
            gen.add(sr.nextInt());
        }
        for (Integer i:gen) {
            if (i % 3 ==0) arr3.add(i);
            if (i % 2 ==0) arr2.add(i);
            if (!(i % 2 ==0) && !(i % 3 ==0)) other.add(i);
        }

        printList(arr3);
        printList(arr2);
        printList(other);
    }

    public static void printList(List<Integer> list) {
        for (Integer i:list) {
            System.out.println(i);
        }
    }
}
