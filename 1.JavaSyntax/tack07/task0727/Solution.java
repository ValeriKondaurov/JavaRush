package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Меняем функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }
        String s;
        ArrayList<String> listd = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            s = list.get(i);
            if (s.length()%2 ==0) listd.add(list.get(i) + " " + list.get(i));
             else listd.add(list.get(i) + " " + list.get(i)+ " " + list.get(i));
        }

        for (int i = 0; i < listd.size(); i++) {

            System.out.println(listd.get(i));
        }
    }
}
