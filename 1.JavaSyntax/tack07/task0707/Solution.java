package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList <String> arr = new ArrayList<String>();
        arr.add("First");
        arr.add("Second");
        arr.add("Third");
        arr.add("Fourth");
        arr.add("Fifth");
        System.out.println(arr.size());
        for (String s:arr) {
            System.out.println(s);
        }
    }
}
