package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);
        FileInputStream fileInput = new FileInputStream(reader.nextLine());
        FileOutputStream fileOutput = new FileOutputStream(reader.nextLine());
        String sNum;


        do {
            sNum = "";
            int data = fileInput.read();
            while (data!=32 && data!=-1) {
                sNum = sNum +  (char) data;
                data = fileInput.read();
            }
            System.out.println(sNum);
            int num = (int) Math.round(Double.parseDouble(sNum));
            System.out.println(num);
            char[] cNum = String.valueOf(num).toCharArray();
            byte[] bNum = new byte[cNum.length+1];
            for (int i=0; i<cNum.length; i++)
                bNum[i] = (byte) cNum[i];
            bNum[bNum.length-1] = 32;
            fileOutput.write(bNum);
        } while (fileInput.available()>0);
        fileInput.close();
        fileOutput.close();
    }
}
