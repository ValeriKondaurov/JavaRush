package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(r.readLine());
        int n;
        while (num!=0) {
            n = num % 10;
            num = num/10;
            if (n%2 == 0) even++;
            else odd++;
        }
        System.out.println("Even: " + even + " Odd: " + odd);

    }
}
