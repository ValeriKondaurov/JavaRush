package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static boolean fileFound=true;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "";
        ArrayList <FileInputStream> fileArray = new ArrayList<>();
        while (fileFound) {
                try {
                    fileName = reader.readLine();
                    fileArray.add(new FileInputStream(fileName));
                } catch (FileNotFoundException e ) {
                    System.out.println(fileName);
                    fileFound = false;
                }
        }

        for (FileInputStream fileInputStream:fileArray)
            fileInputStream.close();
    }


    /*public static class ReadThread extends Thread{
        private String nameFile;
        private FileInputStream file;
        public ReadThread(String nameFile) {
            this.nameFile = nameFile;
        }

        @Override
        public void run() {
            try {
                file = new FileInputStream(nameFile);
                while (file.available()>0 || fileFound) file.read();
                file.close();
            } catch (FileNotFoundException e) {
                System.out.println(this.nameFile);
                fileFound = false;
                return;
            } catch (IOException e) {e.printStackTrace();}
        }
    }*/

}

