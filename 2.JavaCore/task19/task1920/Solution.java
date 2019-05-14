package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        FileReader file = new FileReader(args[0]);
        Map<String, Double> emploey = new HashMap<>();

        while (file.ready()) {
            String str="";
            int symNum = 0;
            while ((symNum)!=10 && file.ready()) {
                symNum = file.read();
                str += (char) symNum;
            }

            String[] s = str.split(" ");
            if (emploey.containsKey(s[0]))
                emploey.replace(s[0], emploey.get(s[0]), emploey.get(s[0])+Double.parseDouble(s[1]));
            else emploey.put(s[0], Double.parseDouble(s[1]));

        }
        file.close();
        double max = 0;
        Collection<Double> array =  emploey.values();
        for (Double me:array)
            if (me >  max) max = me;

        for (Map.Entry<String, Double> me:emploey.entrySet())
            if (me.getValue() == max)
                System.out.println(me.getKey());

    }
}
