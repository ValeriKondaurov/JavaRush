package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileRead = new BufferedReader(new FileReader(fileName.readLine()));
        BufferedWriter fileWriter =  new BufferedWriter(new FileWriter(fileName.readLine()));
        fileName.close();
        while (fileRead.ready()) {
            String[] word = fileRead.readLine().split(" ");
            for (String num:word){
                try {
                    Integer.parseInt(num);
                    fileWriter.write(num + " ");
                } catch (NumberFormatException e) {

                }
            }
        }

        fileRead.close();
        fileWriter.close();
    }
}
