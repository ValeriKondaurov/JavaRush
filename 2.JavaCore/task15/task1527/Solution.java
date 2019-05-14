package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s= "";
        try {
            String url = reader.readLine();
            int start = url.indexOf("?")+1;
            Map<String, String> parameterUrl = new HashMap<>();
            String[] parameterAndValue = new String[2];
            while (true) {
                int end = (url.indexOf("&")==-1 ? url.length(): url.indexOf("&"));
                String parameter = url.substring(start, end);
                if (parameter.contains("="))
                    parameterAndValue = parameter.split("=");
                else {
                    parameterAndValue[0] = parameter;
                    parameterAndValue[1] = "";
                }

                parameterUrl.put(parameterAndValue[0], parameterAndValue[1]);
                System.out.print(parameterAndValue[0] + " ");
                if (end == url.length()) break;
                url = url.substring(end+1);
                start = 0;
            }
            System.out.println();
            for (Map.Entry<String, String>  p:parameterUrl.entrySet()) {
                s = p.getValue();
                if (p.getKey().equals("obj")) alert(Double.parseDouble(s));
            }
        }  catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            alert(s);
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
