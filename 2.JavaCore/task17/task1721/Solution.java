package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        allLines.addAll(FileToList());
        forRemoveLines.addAll(FileToList());

        Solution solution = new Solution();
        try {
            solution.joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) allLines.removeAll(forRemoveLines);
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }

    public static List<String> FileToList () {
        List<String> list = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            FileReader file = new FileReader(reader.readLine());
            reader = new BufferedReader(file);
            String line = reader.readLine();

            while (line !=null) {
                list.add(line);
                line = reader.readLine();
            }
            file.close();
            reader.close();
        } catch (FileNotFoundException e) {}
        catch (IOException e) { }
        return list;
    }
}
