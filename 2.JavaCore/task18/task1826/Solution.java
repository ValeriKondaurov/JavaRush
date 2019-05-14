package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutput;
        switch (args[0]) {
            case ("-e"):
                fileOutput = new FileOutputStream(args[2]);
                fileOutput.write(encode(args[1]));
                fileOutput.close();
                break;
            case ("-d"):
                fileOutput = new FileOutputStream(args[2]);
                fileOutput.write(decode(args[1]));
                fileOutput.close();
                break;

        }
    }

    private static byte[] encode(String fileName) throws IOException {
        FileInputStream fileInput = new FileInputStream(fileName);
        List<Byte> data = new ArrayList<>();
        while (fileInput.available()>0) {
            data.add((byte) (Byte.MAX_VALUE - fileInput.read()));
        }
        fileInput.close();
        byte[] code =  new byte[data.size()];
        for (int i=0; i<data.size(); i++)
            code[i] = data.get(i);
        return code;
    }
    private static byte[] decode(String fileName) throws IOException {
        FileInputStream fileInput = new FileInputStream(fileName);
        List<Byte> data = new ArrayList<>();
        while (fileInput.available()>0) {
            data.add((byte) (Byte.MAX_VALUE - fileInput.read()));
        }
        fileInput.close();
        byte[] code =  new byte[data.size()];
        for (int i=0; i<data.size(); i++)
            code[i] = data.get(i);
        return code;
    }

}
