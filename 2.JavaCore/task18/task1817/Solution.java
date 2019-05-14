package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream(args[0]);
            int countAll=0;
            int countSP=0;
            while (file.available()>0) {
                int data = file.read();
                countAll++;
                if (data==32 ) countSP++;
            }
            file.close();
            double relation = (double) countSP/ countAll*100 ;
            System.out.println(String.format("%(.2f", relation));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
