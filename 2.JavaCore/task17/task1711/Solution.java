package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i = i + 3)
                        addPeople(args[i], args[i + 1], args[i + 2]);
                }
                    break;
            case "-u":
               synchronized (allPeople) {
                   for (int i = 1; i < args.length; i = i + 4)
                       updatePeople(args[i], args[i + 1], args[i + 2], args[i + 3]);
               }
               break;

            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++)
                        deletePeople(args[i]);
                }
                break;

            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++)
                        infoPeople(args[i]);
                }
                break;
            default:
                synchronized (allPeople) {
                    System.out.println("Indalid command");
                }
        }
    }

    public static void addPeople (String name, String sex, String dateString) {
        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateString);
            if (sex.equals("м")) allPeople.add(Person.createMale(name, date));
            else allPeople.add(Person.createFemale(name, date));
            System.out.println(allPeople.size()-1);
        } catch (ParseException e) {
            System.out.println("Ошибка формата даты");;
        }
    }

    public static void updatePeople (String index, String name, String sex, String dateString) {
        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateString);

            if (sex.equals("м"))
                allPeople.set(Integer.parseInt(index), Person.createMale(name, date));
            else
                allPeople.set(Integer.parseInt(index), Person.createFemale(name, date));

        } catch (ParseException e) {
            System.out.println("Ошибка формата даты");;
        }
    }

    public static void deletePeople (String i) {
        int index = Integer.parseInt(i);
        allPeople.get(index).setName(null);
        allPeople.get(index).setSex(null);
        allPeople.get(index).setBirthDate(null);
    }

    public static void infoPeople (String i) {
        int index = Integer.parseInt(i);
        Person person = allPeople.get(index);
        String sex = null;
        if (person.getSex() == Sex.MALE) sex = "м";
        else sex = "ж";
        String dateString = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(person.getBirthDate());
        System.out.println(person.getName() + " " + sex + " " + dateString);
    }


}
