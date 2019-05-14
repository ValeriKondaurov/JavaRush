package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;


/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> files= new ArrayList<>();
        String fileName;
        while (!(fileName= reader.readLine()).equals("end")) {
            files.add(fileName);
        }
        reader.close();
        Collections.sort(files);
        String fileNameAll = files.get(0).substring(0, files.get(0).indexOf(".part"));

        FileOutputStream fileOut = new FileOutputStream(fileNameAll);
        for (String file:files) {
            System.out.println(file);
            BufferedInputStream buffer = new BufferedInputStream(new FileInputStream(file), 100);
            int i;
            while ((i = buffer.read())!=-1) {
                System.out.println(i);
            fileOut.write(i);
            }
            buffer.close();
        }
        fileOut.close();

    }

    public static String fileRead (String fileName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        String str = "";
        while (fileInputStream.available()>0)
            str+=(char)fileInputStream.read();
        fileInputStream.close();
        return str;
    }
}
