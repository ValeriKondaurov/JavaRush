package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);
        String fileName = reader.nextLine();
        FileInputStream file1Input = new FileInputStream(fileName);
        byte[] data = new byte[1000];
        int count = file1Input.read(data);
        file1Input.close();
        FileOutputStream file1Output = new FileOutputStream(fileName);
        FileInputStream file2 = new FileInputStream(reader.nextLine());
        while (file2.available()>0) {
            file1Output.write(file2.read());
        }
        file2.close();
        for (int i = 0; i<count; i++) {
            file1Output.write(data[i]);
        }
        file1Output.close();
    }
}
