package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException{
        if (args.length==0) return;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        String s;
        int idMax = 0;
        ArrayList<String> data = new ArrayList<>();
        while ((s = fileReader.readLine()) != null) {
            data.add(s);
        }
        reader.close();
        fileReader.close();

        String idUpdate = args[1];
        int index = 0;
        for (int i = 0; i < data.size(); i++) {
            int id = Integer.parseInt(data.get(i).substring(0, 8).trim());
            if (id == Integer.parseInt(idUpdate)) {
                data.remove(i);
                index = i;
                break;
            }
        }


        if (args[0].equals("-u")) {
                String productName = "";
                String price = args[args.length - 2];
                String quantity = args[args.length - 1];

                for (int i = 2; i < args.length - 2; i++) {
                    productName += args[i] + " ";
                }
                String updateStr = setLength(idUpdate, 8) + setLength(productName, 30)
                        + setLength(price, 8) + setLength(quantity, 4);

                data.add(index, updateStr);
        }

        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName));
        for (String str : data)
            fileWriter.write(str + "\n");
        fileWriter.close();
    }

    public static String setLength (String s, int length) {
        if (s.length() < length) {
            while (s.length()<length) s+=" ";
        } else s=s.substring(0, length);
        return s;
    }

}
