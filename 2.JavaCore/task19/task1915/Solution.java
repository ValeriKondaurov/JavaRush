package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();
        reader.close();
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream arrayStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(arrayStream);
        System.setOut(stream);
        testString.printSomething();

        String result = arrayStream.toString();

        System.setOut(consoleStream);

        System.out.println(result);
        FileOutputStream writer = new FileOutputStream(fileName);
        writer.write(result.getBytes());
        writer.close();

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

