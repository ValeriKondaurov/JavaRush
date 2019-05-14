package com.javarush.task.task19.task1914;

/* 
Решаем пример
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

        String result = arrayStream.toString().trim();
        String[] array = result.split(" ");
        int numResult = 0;
        switch (array[1]) {
            case ("+"): numResult = Integer.parseInt(array[0]) + Integer.parseInt(array[2]);
                        break;
            case ("*"): numResult = Integer.parseInt(array[0]) * Integer.parseInt(array[2]);
                break;
            case ("-"): numResult = Integer.parseInt(array[0]) - Integer.parseInt(array[2]);
        }

        System.setOut(consoleStream);
        System.out.println(result +  " " + numResult);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

