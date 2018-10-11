package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

import java.security.PrivateKey;

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man ("Ivan", 30, "Rostov");
        Man man2 = new Man ("Yan", 40, "Ufa");
        System.out.println(man1.getName() +  " " + man1.getAge() + " " + man1.getAddress());
        System.out.println(man2.getName() +  " " + man2.getAge() + " " + man2.getAddress());

        Woman woman1 = new Woman ("Sally", 30, "Rostov");
        Woman woman2 = new Woman ("Yulia", 40, "Ufa");
        System.out.println(woman1.getName() +  " " + woman1.getAge() + " " + woman1.getAddress());
        System.out.println(woman2.getName() +  " " + woman2.getAge() + " " + woman2.getAddress());
    }

    public static class Man {
        private String name;
        private int age;
        private String address;

        public Man (String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String getName () {
            return this.name;
        }

        public int getAge () {
            return this.age;
        }

        public String getAddress () {
            return this.address;
        }
   }

    public static class Woman {
        private String name;
        private int age;
        private String address;

        public Woman (String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String getName () {
            return this.name;
        }

        public int getAge () {
            return this.age;
        }

        public String getAddress () {
            return this.address;
        }
    }
}
