package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            FileInputStream file1 = new FileInputStream(reader.readLine());

            FileOutputStream file2= new FileOutputStream(reader.readLine());
            FileOutputStream file3= new FileOutputStream(reader.readLine());
            byte[] buffer = new byte[1000];
            int count = 0;
            if  (file1.available() > 0) {
                count = file1.read(buffer);
            }
            if (count%2 ==0) {
                int size = count / 2;
                file2.write(buffer, 0, size);
                file3.write(buffer, size, count - size);
            } else {
                int size = count / 2+1;
                file2.write(buffer, 0, size);
                file3.write(buffer, size, count - size);
            }
            file1.close();
            file2.close();
            file3.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
