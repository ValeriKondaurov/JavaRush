package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sr = new Scanner(System.in);
        ArrayList <String> list = new ArrayList<>();
        for (int  i = 0; i<10; i++) {
            list.add(sr.nextLine());
        }
        ArrayList<String> result = doubleValues(list);

        for (String s:result) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = 0; i<list.size(); i = i + 2) {
            list.add(i+1,list.get(i));
        }
        return list;
    }
}
