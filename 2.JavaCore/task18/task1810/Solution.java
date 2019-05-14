package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            FileInputStream file1;
            while (true) {
                file1 = new FileInputStream(reader.readLine());
                if (file1.available() < 1000) {
                    file1.close();
                    throw new DownloadException();
                } else file1.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static class DownloadException extends Exception {

    }
}
