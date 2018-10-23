package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList <String> st = new ArrayList<>();
        Collections.addAll(st, "мама", "мыла", "раму");
        st.add(1, "именно");
        st.add(3, "именно");
        st.add(5, "именно");
        for (String i:st) {
            System.out.println(i);
        }
    }
}
