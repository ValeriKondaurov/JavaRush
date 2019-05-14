package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = null;
        BufferedInputStream buffer = null;

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String file = reader.readLine();
            reader.close();
            inputStream = new FileInputStream(file);
            buffer = new BufferedInputStream(inputStream);
            while (buffer.available()>0) {
                System.out.print((char) buffer.read());
            }

        } catch (Exception e){
            e.printStackTrace();

        } finally {
            inputStream.close();
            buffer.close();
        }
    }
}