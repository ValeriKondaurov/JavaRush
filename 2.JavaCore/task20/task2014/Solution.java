package com.javarush.task.task20.task2014;


import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/
public class Solution implements Serializable {
    public static void main(String[] args) {

        try {
            Solution saveObject = new Solution(4);
            FileOutputStream fileOutputStream =  new FileOutputStream("c:\\java\\Solution.dat");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(saveObject);
            fileOutputStream.close();
            outputStream.close();

            FileInputStream fileIS = new FileInputStream("c:\\java\\Solution.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileIS);
            Solution loadObject = (Solution) objectInputStream.readObject();
            fileIS.close();
            objectInputStream.close();
            System.out.println((saveObject.string.equals(loadObject.toString())));

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }

        System.out.println(new Solution(4));
    }

    transient private final String pattern = "dd MMMM yyyy, EEEE";
    transient private Date currentDate;
    transient private int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
