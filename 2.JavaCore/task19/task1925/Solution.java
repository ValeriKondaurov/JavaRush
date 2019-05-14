package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(args[0]);
        BufferedReader readerFile = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter(args[1]);
        String str = "";
        while (readerFile.ready()) {
            str+=readerFile.readLine() + " ";
        }
        String[] sArray = str.split(" ");
        String longWord = "";
        for (String s:sArray)
            if (s.length() > 6) longWord+=s+",";
        fileWriter.write(longWord.substring(0, longWord.length()-1));
        fileReader.close();
        fileWriter.close();
    }
}
