package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList <String> arr = new ArrayList<>();
        Scanner sr = new Scanner(System.in);
        for (int i = 0; i<5; i++) {
            arr.add(sr.nextLine());
        }
        arr.remove(2);
        for (int  i = arr.size()-1; i>-1; i--) {
            System.out.println(arr.get(i));
        }
    }
}


