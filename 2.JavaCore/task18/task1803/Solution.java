package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader( System.in));

        String fileName = reader.readLine();

        FileInputStream file = new FileInputStream(fileName);
        Map<Integer, Integer> data = new HashMap<>();
        data.put(file.read(), 1);
        while (file.available()>0) {
            int dataByte = file.read();
            if (data.get(dataByte) == null) data.put(dataByte, 1);
            else  data.put(dataByte, data.get(dataByte)+1);
        }
        file.close();

        int max = 0;

        for (Map.Entry<Integer,Integer> me:data.entrySet())
            if (me.getValue() > max) max = me.getValue();

        for (Map.Entry<Integer,Integer> me:data.entrySet())
            if (me.getValue() == max) System.out.print(me.getKey() + " ");;


    }
}
