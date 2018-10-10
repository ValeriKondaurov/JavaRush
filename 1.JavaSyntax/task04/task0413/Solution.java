package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumdayweek = reader.readLine();
        int numdayweek = Integer.parseInt(sNumdayweek);
        if (numdayweek == 1) System.out.println("понедельник");
        else if (numdayweek == 2) System.out.println("вторник");
        else if (numdayweek == 3) System.out.println("среда");
        else if (numdayweek == 4) System.out.println("четверг");
        else if (numdayweek == 5) System.out.println("пятница");
        else if (numdayweek == 6) System.out.println("суббота");
        else if (numdayweek == 7) System.out.println("воскресенье");
        else System.out.println("такого дня недели не существует");
    }

}