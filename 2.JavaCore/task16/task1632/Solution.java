package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        threads.add(new FirstThread());
        threads.add(new SecondThread());
        threads.add(new ThirdThread());
        threads.add(new FourthThread());
        threads.add(new FifthThread());


    }

    public static void main(String[] args) {
    }

    public static class FirstThread extends Thread{

        @Override
        public void run() {
            while (true) {}
        }
    }

    public static class SecondThread extends Thread{

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class ThirdThread extends Thread{

        @Override
        public void run() {
                while (true) {
                    System.out.println("Ура");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {}
                }
        }
    }

    public static class FourthThread extends Thread implements Message{

        @Override
        public void showWarning() {
            if (this.isAlive()) this.interrupt();
        }

        @Override
        public void run() {
            while (!this.isInterrupted()) {

            }
        }
    }

    public static class FifthThread extends Thread {


        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;
            try {
                String num = reader.readLine();
                while (!num.equals("N")) {
                    sum += Integer.parseInt(num);
                    num = reader.readLine();
                }
                System.out.println(sum);
            } catch (IOException e) {e.printStackTrace();};
        }
    }

}