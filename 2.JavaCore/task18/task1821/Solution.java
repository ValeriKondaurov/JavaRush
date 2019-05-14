package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream(args[0]);
        Map<Integer, Integer> data = new TreeMap<>();
        data.put(file.read(), 1);
        while (file.available()>0) {
            int dataByte = file.read();
            if (data.get(dataByte) == null) data.put(dataByte, 1);
            else  data.put(dataByte, data.get(dataByte)+1);
        }
        file.close();

        for (Map.Entry<Integer, Integer> me:data.entrySet()) {
            int i = me.getKey();
            System.out.println((char) i  + " " + me.getValue());
        }
    }
}
