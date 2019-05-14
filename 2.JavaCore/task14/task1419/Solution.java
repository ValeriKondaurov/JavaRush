package com.javarush.task.task14.task1419;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        //1
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //2
        try {
            ArrayList<String> s = new ArrayList<>();
            s.get(100);

        } catch (Exception e) {
            exceptions.add(e);
        }
        //3
        try {
            File file = new File("path");
            FileInputStream fis = new FileInputStream(file);
            String s = "inside";

        } catch (Exception e) {
            exceptions.add(e);
        }

        //4
        try {
            Integer.parseInt(null);
        } catch (Exception e) {
            exceptions.add(e);
        }

        //5
        try {
            Object[] o = "a;b;c".split(";");
            o[0] = 42;
        } catch (Exception e) {
            exceptions.add(e);
        }

        //6
        try {
            Object i = Integer.valueOf(42);
            String s = (String)i;
        } catch (Exception e) {
            exceptions.add(e);
        }

        //7
        try {
            String[] s = new String[-1];

        } catch (Exception e) {
            exceptions.add(e);
        }

        //8
        try {
            String str=null;
            System.out.println("Length :"+str.length());
        } catch (Exception e) {
            exceptions.add(e);
        }

        //9
        try {
            String s = "qwerty";
            s = s.substring(7,3);

        } catch (Exception e) {
            exceptions.add(e);
        }

        //10
        try {
            List<Integer> list1 = Arrays.asList(10,20,60,30,22,70,89);

            List<Integer> list2 = Arrays.asList(1,2,45,23,89,66,87,33,19,39);

            list1.addAll(list2);

        } catch (Exception e) {
            exceptions.add(e);
        }


    }
}
