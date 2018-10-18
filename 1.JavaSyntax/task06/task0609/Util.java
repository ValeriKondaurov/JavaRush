package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

import static java.lang.Math.*;

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        return sqrt(pow ((x2-x1), 2) + pow ((y2-y1) ,2));
    }

    public static void main(String[] args) {
        System.out.println(Util.getDistance(2,2,4,4));

    }
}
