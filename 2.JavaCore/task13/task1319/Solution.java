package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try {


            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String file = reader.readLine();
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            String s = null;
            do {
                s = reader.readLine();
                writer.write(s + "\n");
            } while (!s.equals("exit"));

            writer.close();
        } catch (Exception e)  {
            e.printStackTrace();
        }
    }
}
