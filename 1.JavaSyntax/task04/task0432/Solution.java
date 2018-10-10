package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();
        String sNum = r.readLine();
        int num = Integer.parseInt(sNum);
        int i = 0;
        while (i < num) {
            System.out.println(s);
            i++;
        }

    }
}
