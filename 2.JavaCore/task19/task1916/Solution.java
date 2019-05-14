package com.javarush.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        ArrayList<String> file1 = readFile(reader.readLine());
        ArrayList<String> file2 = readFile(reader.readLine());
        reader.close();
        int i = 0;
        while ((i < file1.size()) || (i < file2.size())){
            try {
                if (file1.get(i).equals(file2.get(i))) {
                    lines.add(new LineItem(Type.SAME, file1.get(i)));
                } else if (file1.get(i).equals(file2.get(i + 1))) {
                    lines.add(new LineItem(Type.ADDED, file2.get(i)));
                    file1.add(i, "empty");
                } else {
                    lines.add(new LineItem(Type.REMOVED, file1.get(i)));
                    file2.add(i, "empty");
                }
            } catch (IndexOutOfBoundsException e) {
                if (file1.size()>file2.size()) lines.add(new LineItem(Type.REMOVED, file1.get(i)));
                else lines.add(new LineItem(Type.ADDED, file2.get(i)));
            }

            i++;
        }

        for (LineItem li:lines)
            System.out.println(li.type + " - " + li.line);
    }

    public static ArrayList<String> readFile(String fileName) throws IOException {
        BufferedReader file = new BufferedReader(new FileReader(fileName));
        ArrayList<String>  data = new ArrayList<>();
        while (file.ready()){
            data.add(file.readLine());
        }
        file.close();
        return data;
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
