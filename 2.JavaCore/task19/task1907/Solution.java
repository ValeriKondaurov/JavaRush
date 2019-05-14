package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileRead = new FileReader(fileName.readLine());
        fileName.close();
        String word = "";
        int count = 0;
        while (fileRead.ready()) {
            int symCode = fileRead.read();
            if ((symCode > 64 && symCode < 91) ||
                    (symCode > 96 && symCode < 123)) word+=String.valueOf((char) symCode);
            else {
                if (word.equals("world")) count++;
                word = "";
            }
        }
        fileRead.close();
        System.out.println(count);
    }
}
