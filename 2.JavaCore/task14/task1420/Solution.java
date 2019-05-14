package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        if (Integer.parseInt(s1)<=0 || Integer.parseInt(s2)<=0)
                throw new Exception();
        Integer numFirst = Integer.parseInt(s1);

        Integer numSecond = Integer.parseInt(s2);


        System.out.println(nod(numFirst, numSecond));

    }

    public static int nod (int a, int b) {
        Integer nodStart = (a<b? a: b);
        Integer nod = 1;
        for (int i = nodStart; i>0; i--) {
            if ((a % i == 0) && (b % i ==0))
            {
                nod = i;
                break;
            }
        }
        return nod;
    }
}
