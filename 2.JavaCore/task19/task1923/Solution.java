package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException{
        FileReader fileReader = new FileReader(args[0]);
        FileWriter fileWriter = new FileWriter(args[1]);
        String str = "";
        while (fileReader.ready()) {
            str+=(char) fileReader.read();
        }
        System.out.println(str);

        str = str.replaceAll(System.getProperty("line.separator"), " ");
        System.out.println(str);
        String[] sArray = str.split(" ");
        for (String s:sArray)
            for (byte b:s.getBytes())
                if (b > 47 && b < 58) {
                    fileWriter.write(s + " ");
                    break;
                }
        fileReader.close();
        fileWriter.close();
    }
}
