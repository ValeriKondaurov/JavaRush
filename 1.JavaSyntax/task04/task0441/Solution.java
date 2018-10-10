package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if ((a==b) || (b==c)) System.out.println(b);
        else if (a==c) System.out.println(a);
        else if ((a > b && b > c) || (c > b && b > a)) System.out.println(b);
        else if ((b > a && a > c) || (c > a && a > b))  System.out.println(a);
        else if ((b > c && c > a) || (a > c && c > b)) System.out.println(c);
    }
}
