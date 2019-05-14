package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sFile = reader.readLine();
        while (!sFile.equals("exit")) {
            new ReadThread(sFile).start();
            sFile = reader.readLine();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(Map.Entry<String, Integer> me:resultMap.entrySet())
            System.out.println(me.getKey() + " " + me.getValue());
    }

    public static class ReadThread extends Thread {
        private String fileName ;
        public ReadThread(String fileName) {
            this.fileName= fileName;
        }

        @Override
        public void run() {
            try {
                FileInputStream file = new FileInputStream(fileName);
                Map<Integer, Integer> data = new HashMap<>();
                data.put(file.read(), 1);
                while (file.available()>0) {
                    int dataByte = file.read();
                    if (data.get(dataByte) == null) data.put(dataByte, 1);
                    else  data.put(dataByte, data.get(dataByte)+1);
                }
                file.close();
                int max = Integer.MIN_VALUE;
                int maxSym = 0;

                for (Map.Entry<Integer,Integer> me:data.entrySet())
                    if (me.getValue() > max) { max = me.getValue();
                                            maxSym = me.getKey();
                }

                synchronized (resultMap) {
                    resultMap.put(fileName, maxSym);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
