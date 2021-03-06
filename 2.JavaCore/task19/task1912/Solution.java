package com.javarush.task.task19.task1912;

/* 
Ридер обертка 2
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

        System.setOut(consoleStream);

        System.out.println(result.replaceAll("te", "??"));

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
