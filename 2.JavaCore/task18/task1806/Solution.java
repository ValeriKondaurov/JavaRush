package com.javarush.task.task18.task1806;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Исправить ошибки
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("c:/java/2.txt");
        // Создаем поток-записи-байт-в-файл
        FileOutputStream outputStream = new FileOutputStream("c:/java/5.txt");
        byte[] buffer = new byte[1000];
        int count = 0;
        if  (inputStream.available() > 0) {
            count = inputStream.read(buffer);

        }

        inputStream.close();
        outputStream.write(buffer, 0, count);
        outputStream.close();
    }
}
