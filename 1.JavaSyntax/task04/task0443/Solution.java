package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int y = s.nextInt();
        int m = s.nextInt();
        int d = s.nextInt();
        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + d + "." + m + "." + y);

    }
}
