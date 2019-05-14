package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        reader.close();
        BufferedReader readerFile = new BufferedReader(fileReader);
        while (readerFile.ready()) {
            System.out.println(reverseWord(readerFile.readLine()));
        }
        fileReader.close();
    }

    public static String reverseWord (String s) {
        char[] c = s.toCharArray();
        String reverse = "";
        for(int i=c.length-1; i>-1; i--)
            reverse+=c[i];
        return reverse;
    }
}
