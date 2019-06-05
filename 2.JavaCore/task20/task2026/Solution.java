package com.javarush.task.task20.task2026;

/* 
Алгоритмы-прямоугольники
*/
public class Solution {

    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };

        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Должно быть 2");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Должно быть 4");
    }


    public static int getRectangleCount(byte[][] a) {
        int count = 0;
        boolean[][] rectangle = new boolean[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a.length; j++)
                if (a[i][j] ==1 && !rectangle[i][j]) {
                    int k = i;
                    while (a[k][j] == 1 ) {
                        rectangle[k][j] = true;
                        if (k + 1 >= a.length) {k++; break;}
                        k++;
                    }
                    k--;
                    int m = j;
                    while (a[k][m] == 1 ) {
                        for (int t = i; t <= k; t++)
                            rectangle[t][m] = true;
                        if (m + 1 >= a[k].length) break;
                        m++;
                    }
                    count++;
                    /*for (boolean[] b1:rectangle) {
                        for (boolean b2 : b1)
                            System.out.print(b2 + " ");
                        System.out.println();
                    }
                    System.out.println();*/
                }

        return count;
    }
}
