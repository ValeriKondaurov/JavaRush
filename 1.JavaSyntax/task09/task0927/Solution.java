package com.javarush.task.task09.task0927;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }



    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<>();
        for (int i =0; i<10; i++) {
            String name = "Вася" + i;
            map.put(name, new Cat(name));
        }
        return  map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet<Cat>();
        Iterator<HashMap.Entry<String, Cat>> iterator = map.entrySet().iterator();
        HashMap.Entry<String,Cat> pair;
        int count = 0;
        while (iterator.hasNext()) {
            pair = iterator.next();
           set.add(pair.getValue());
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
