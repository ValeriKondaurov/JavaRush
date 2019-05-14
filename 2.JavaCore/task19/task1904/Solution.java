package com.javarush.task.task19.task1904;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        PersonScannerAdapter pr = new PersonScannerAdapter(new Scanner(new FileReader("c:\\java\\pr.txt")));
        Person person = pr.read();
        System.out.println(person);
    }

    public static class PersonScannerAdapter implements PersonScanner{
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String [] s = fileScanner.nextLine().split(" ");
            Date date = new Date();
            try {
                date = new SimpleDateFormat("dd MM yyyy").parse(s[3] + " " + s[4] + " " + s[5]);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return new Person(s[1], s[2], s[0], date);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
