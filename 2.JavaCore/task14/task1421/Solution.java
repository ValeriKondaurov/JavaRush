package com.javarush.task.task14.task1421;

/* 
Earth
*/
public class Solution {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1.equals(singleton2));
    }
}
