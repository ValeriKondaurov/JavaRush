package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileRead = new FileReader(fileName.readLine());
        FileWriter fileWriter = new FileWriter(fileName.readLine());
        fileName.close();
        int i= 0;
        while (fileRead.ready()) {
            i++;
            int c = fileRead.read();
            if (i % 2 == 0) fileWriter.write(c);
        }
        fileRead.close();
        fileWriter.close();

    }
}
