package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import static javafx.scene.input.KeyCode.M;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {

        if (args[0].equals("-c")) {
            try {
                Date date = new SimpleDateFormat("dd/MM/yyyy").parse(args[3]);
                if (args[2].equals("м")) allPeople.add(Person.createMale(args[1], date));
                else allPeople.add(Person.createFemale(args[1], date));
                System.out.println(allPeople.size()-1);
            } catch (ParseException e) {
                System.out.println("Ошибка формата даты");;
            }
        }

        else if (args[0].equals("-u")) {
                try {
                    Date date = new SimpleDateFormat("dd/MM/yyyy").parse(args[4]);

                    if (args[3].equals("м"))
                            allPeople.set(Integer.parseInt(args[1]), Person.createMale(args[2], date));
                    else
                        allPeople.set(Integer.parseInt(args[1]), Person.createFemale(args[2], date));

                } catch (ParseException e) {
                    System.out.println("Ошибка формата даты");;
                }
        }

        else if (args[0].equals("-d")) {
            int index = Integer.parseInt(args[1]);
            allPeople.get(index).setName(null);
            allPeople.get(index).setSex(null);
            allPeople.get(index).setBirthDate(null);

        }

        else if (args[0].equals("-i")) {
            int index = Integer.parseInt(args[1]);
            Person person = allPeople.get(index);
            String sex = null;
            if (person.getSex() == Sex.MALE) sex = "м";
            else sex = "ж";
            String dateString = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(person.getBirthDate());
            System.out.println(person.getName() + " " + sex + " " + dateString);
        }

        /*for (Person person:allPeople)
            System.out.println(person.getName() + " " + person.getSex() + " " + person.getBirthDate());*/
    }
}
