package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.*;
import java.util.function.BiConsumer;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();


    public void fillInPropertiesMap() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream file = new FileInputStream(fileName);
        load(file);
        file.close();

        /*FileOutputStream file1 = new FileOutputStream("c:\\java\\1_new.txt");
        save(file1);
        file1.close();*/

    }

    public void save(OutputStream outputStream) throws Exception {
        PrintWriter writer = new PrintWriter(outputStream);
        for(Map.Entry<String,String> p:properties.entrySet()) {
            if (p.getKey().contains(" "))
                    writer.println(p.getKey().replace(" " , "\\ ") + " : " + p.getValue());
            else writer.println(p.getKey() + " : " + p.getValue());

            writer.flush();
        }

    }

    public void load(InputStream inputStream) throws Exception {
            // version 2. Write with class Properties

        Properties prop = new Properties();
        prop.load(inputStream);
        Enumeration e = prop.propertyNames();
        while (e.hasMoreElements()) {
            String key = (String) e.nextElement();
            String value = prop.getProperty(key);
            properties.put(key, value);
        }


        // version 1. Parse Readline with criteries http://ru.wikipedia.org/wiki/.properties
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

        String s;
        while (reader.ready()) {
            s = reader.readLine().trim();

            if (s.startsWith("#") || s.startsWith("!") || s.length()<3) continue;

            if (s.lastIndexOf('\\') == s.length()-1) s = s.substring(0, s.length()-1) + reader.readLine().trim();

            int splitIndex = 0;
            for (char c:s.toCharArray()) {
                if ((c == ':') || (c == '=')){
                    splitIndex = s.indexOf(c);
                    break;
                }
            }
             if (splitIndex>0) {
                String[] sArray = new String[2];
                sArray[0] = s.substring(0, splitIndex).trim().replace('\\',(char)0);
                sArray[1] = s.substring(splitIndex+1).trim().replace("\\\\", "\\");
                if (sArray[1].indexOf("\\u")>-1) {
                    char[] c = sArray[1].substring(2).toCharArray();
                    char aChar;
                    int off=0;
                    int value=0;
                    for (int i=0; i<4; i++) {
                        aChar = c[off++];
                        switch (aChar) {
                            case '0': case '1': case '2': case '3': case '4':
                            case '5': case '6': case '7': case '8': case '9':
                                value = (value << 4) + aChar - '0';
                                break;
                            case 'a': case 'b': case 'c':
                            case 'd': case 'e': case 'f':
                                value = (value << 4) + 10 + aChar - 'a';
                                break;
                            case 'A': case 'B': case 'C':
                            case 'D': case 'E': case 'F':
                                value = (value << 4) + 10 + aChar - 'A';
                                break;
                            default:
                                throw new IllegalArgumentException(
                                        "Malformed \\uxxxx encoding.");
                        }
                    }
                    sArray[1] =  String.valueOf((char) value);
                }
                properties.put(sArray[0], sArray[1]);
             }
        }*/

    }

    public static void main(String[] args) throws Exception {
        /*Solution s = new Solution();
        s.fillInPropertiesMap();*/

    }
}
