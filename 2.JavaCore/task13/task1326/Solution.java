package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/


import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        InputStream inputStream = null;
        BufferedInputStream buffer = null;

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String file = reader.readLine();
            reader.close();
            inputStream = new FileInputStream(file);
            buffer = new BufferedInputStream(inputStream);
            ArrayList <Integer> list = new ArrayList<>();
            while (buffer.available()>0) {
                String s = "";
                int b = buffer.read();
                while  (b > 44 && b < 58){
                    s = s + (char) b;
                    b = buffer.read();
                }
                if (s!="")
                    if (Integer.parseInt(s) %2 ==0)
                        list.add(Integer.parseInt(s));
            }
            Collections.sort(list);
            for (Integer i:list)
                System.out.println(i);
        } catch (Exception e){
            e.printStackTrace();

        } finally {
            inputStream.close();
            buffer.close();
        }
    }
}
