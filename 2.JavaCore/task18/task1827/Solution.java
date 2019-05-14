package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length==0) return;
        else if (args[0].equals("-c")) {
            String productName = "";
            String price = args[args.length - 2];
            String quantity = args[args.length - 1];

            for (int i = 1; i < args.length - 2; i++) {
                productName += args[i] + " ";
            }


            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
            String s;
            int idMax = 0;
            while ((s = fileReader.readLine()) != null) {
                int id = Integer.parseInt(s.substring(0, 8).trim());
                if (id > idMax) idMax = id;
            }
            reader.close();
            fileReader.close();
            String idNew = setLength(String.valueOf(++idMax), 8);

            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName, true));
            String newStr = idNew + setLength(productName, 30)
                    + setLength(price, 8) + setLength(quantity, 4);
            fileWriter.write("\n");
            fileWriter.write(newStr);
            fileWriter.close();
        }
    }

    public static String setLength (String s, int length) {
        if (s.length() < length) {
            while (s.length()<length) s+=" ";
        } else s=s.substring(0, length);
        return s;
    }
}
