package com.javarush.task.task19.task1921;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        FileReader file = new FileReader(args[0]);

        while (file.ready()) {
            String str="";
            int symNum = 0;
            while (symNum!=10 && file.ready()) {
                symNum = file.read();
                if (symNum!=10) str += (char) symNum;
            }

            String[] s = str.split(" ");
            String name;
            int day, month, year;
            try {
                day = Integer.parseInt(s[1]);
                month = Integer.parseInt(s[2]);
                year = Integer.parseInt(s[3]);
                name = s[0];
            } catch (NumberFormatException e ) {
                name = s[0] + " " + s[1] + " " + s[2];
                day = Integer.parseInt(s[3]);
                month = Integer.parseInt(s[4]);
                year = Integer.parseInt(s[5]);
            }
            String data = new String(day + " " + month + " " + year);
            Person human =new Person(name, new SimpleDateFormat("dd MM yyyy").parse(data));
            PEOPLE.add(human);
        }
        file.close();

    }
}
