package com.javarush.task.task20.task2025;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/*
Алгоритмы-числа
*/
public class Solution {
    private static long cntSearch;
    private static int N;
    private static int[] digitsMultiSet;

    private static List<Long> results;
    private static long maxPow;
    private static long minPow;

    private static long[][] pows;

    private static void genPows(int N) {
        //if (N > 20) throw new IllegalArgumentException();
        pows = new long[10][N + 1];
        for (int i = 0; i < pows.length; i++) {
            long p = 1;
            for (int j = 0; j < pows[i].length; j++) {
                pows[i][j] = p;
                p *= i;
            }
        }
    }

    private static boolean check(long pow) {
        cntSearch++;
        if (pow >= maxPow) return false;
        if (pow < minPow) return false;

        int[] testMultiSet = new int[10];

        while (pow > 0) {
            int i = (int) (pow % 10);
            testMultiSet[i]++;
            pow = pow / 10;
        }

        for (int i = 0; i < 10; i++) {
            if (testMultiSet[i] != digitsMultiSet[i]) return false;
        }

        return true;
    }

    private static void search(int digit, int unused, long pow) {
        if (digit == 10) {
            if (check(pow)) results.add(pow);
            return;
        }

        if (digit == 9) {
            digitsMultiSet[digit] = unused;
            search(digit + 1, 0, pow + unused * pows[digit][N]);
        } else {
            for (int i = 0; i <= unused; i++) {
                digitsMultiSet[digit] = i;
                search(digit + 1, unused - i, pow + i * pows[digit][N]);
            }
        }
    }

    public static long[] getNumbers(long l) {
        long[] result = null;
        if (l > 0 && l <10) {
            result = new long[(int) l - 1];
            for (long i = 1; i < l; i++)
                result[(int) i - 1] = i;
        } else if (l > 10) {
            int maxN = String.valueOf(l).length();
            //if (maxN >= 20) throw new IllegalArgumentException();

            genPows(maxN);
            results = new ArrayList<>();
            digitsMultiSet = new int[10];
            cntSearch = 0;

            for (N = 1; N <= maxN; N++) {
                minPow = (long) Math.pow(10, N - 1);
                maxPow = (long) Math.pow(10, N);

                search(0, N, 0);
            }

            // System.out.println(cntSearch); // here we print the number of cases calculated

            Collections.sort(results);
            for (int i = 0; i < results.size(); i++)
                if (results.get(i) >= l) {
                    results.remove(i);
                    i--;
                }


            result = new long[results.size()];

            for (int i = 0; i < results.size(); i++)
                result[i] = results.get(i);
        }
        return result;
    }


    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long[] array = getNumbers(93085);
        long end = System.currentTimeMillis() - start;
        long memore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        SimpleDateFormat sdf = new SimpleDateFormat("ss.SSS");
        System.out.println("Time = " + sdf.format(new Date(end)));
        System.out.println("Memory = " + memore / 1048576);

        for(long l:array)
            System.out.println(l);
    }
}
