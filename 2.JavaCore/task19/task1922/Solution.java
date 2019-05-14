package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader file = new FileReader(reader.readLine());
        reader.close();
        while (file.ready()) {
            String str = "";
            int symNum = 0;
            while ((symNum = file.read())!= 10) {
                str += (char) symNum;
                if (!file.ready()) break;
            }
            if (getCountWord(str)==2)
                System.out.println(str);
        }
        file.close();
    }

    public static int getCountWord (String str) {

        String[] sArray = str.split(" ");
        int count = 0;
        for (String s:sArray)
            for (String w:words)
            if (s.equals(w)) count++;

        return count;
    }
}
