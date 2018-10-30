package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet <String> list = new HashSet <> ();
        String [] arr = {"арбуз","банан","вишня","груша","дыня","ежевика","женьшень","земляника","ирис","картофель"};
        for (String s:arr) {
            list.add(s);
        }
        for (String s:list) {
            System.out.println(s);
        }
    }
}
