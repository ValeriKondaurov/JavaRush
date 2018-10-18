package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        Scanner scr = new Scanner(System.in);
        return scr.nextLine();

    }

    public static int readInt() throws Exception {
        Scanner scr = new Scanner(System.in);
        return scr.nextInt();

    }

    public static double readDouble() throws Exception {
        Scanner scr = new Scanner(System.in);
        return scr.nextDouble();

    }

    public static boolean readBoolean() throws Exception {
        Scanner scr = new Scanner(System.in);
        return scr.nextBoolean();
    }

    public static void main(String[] args) {

    }
}
