package com.javarush.task.task18.task1805;

import java.io.*;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader( System.in));

        String fileName = reader.readLine();

        FileInputStream file = new FileInputStream(fileName);
        SortedSet<Integer> data = new TreeSet<>();
        while (file.available()>0) {
            data.add(file.read());
        }
        file.close();
        Iterator<Integer> iterator = data.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");

    }
}
