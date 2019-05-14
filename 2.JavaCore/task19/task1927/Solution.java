package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream arrayStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(arrayStream);
        System.setOut(stream);
        testString.printSomething();

        String result = arrayStream.toString();
        String[] sArray= result.split("\\n");
        System.setOut(consoleStream);
        for(int i=0; i < sArray.length; i++) {
            if (i > 1 && i % 2 == 0) System.out.println("JavaRush - курсы Java онлайн");
            System.out.println(sArray[i]);
        }


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
