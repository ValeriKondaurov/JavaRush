package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap <String, String> map = new HashMap<>();
        String [][] arrt = {{"арбуз", "ягода"},
                {"банан", "трава"},
                {"вишня", "ягода"},
                {"груша", "фрукт"},
                {"дыня", "овощ"},
                {"ежевика", "куст"},
                {"жень-шень", "корень"},
                {"земляника", "ягода"},
                {"ирис", "цветок"},
                {"картофель", "клубень"}};

        for (String[] s:arrt){
            map.put(s[0], s[1]);
        }
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        Map.Entry<String,String> pair;
        String key, value;
        while (iterator.hasNext()) {
            pair = iterator.next();
            key = pair.getKey();
            value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
