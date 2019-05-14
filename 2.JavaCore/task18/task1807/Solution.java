package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader( System.in));

        String fileName = null;
        try {
            fileName = reader.readLine();
            FileInputStream file = new FileInputStream(fileName);
            int count = 0;
            while (file.available()>0)
                if (file.read() == 44) count++;
            System.out.println(count);
            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
