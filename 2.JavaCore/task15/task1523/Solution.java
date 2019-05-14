package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    private String name;
    private int value;

    public  Solution () {}

    protected Solution (String name) {}

    Solution (int value){}

    private Solution (String name, int value) {}


    public static void main(String[] args) {

    }
}

