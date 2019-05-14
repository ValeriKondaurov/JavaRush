package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);
        OutputStream file1 = new FileOutputStream(reader.nextLine());
        FileInputStream file2 = new FileInputStream(reader.nextLine());
        FileInputStream file3 = new FileInputStream(reader.nextLine());

        while (file2.available()>0) {
            file1.write(file2.read());
        }
        file2.close();

        while (file3.available()>0) {
            file1.write(file3.read());
        }
        file3.close();

        file1.close();
    }
}
