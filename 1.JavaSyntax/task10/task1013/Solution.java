package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

import java.io.ByteArrayInputStream;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private Boolean sex;
        private String maritalStatus;
        private Byte age;
        private Byte growth;
        private Byte weight;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, Boolean sex) {
            this.name = name;
            this.sex = sex;
        }

        public Human(String name, Boolean sex, String maritalStatus) {
            this.name = name;
            this.sex = sex;
            this.maritalStatus = maritalStatus;
        }

        public Human(String name, Boolean sex, String maritalStatus, Byte age) {
            this.name = name;
            this.sex = sex;
            this.maritalStatus = maritalStatus;
            this.age = age;
        }

        public Human(String name, Boolean sex, String maritalStatus, Byte age, Byte growth, Byte weight) {
            this.name = name;
            this.sex = sex;
            this.maritalStatus = maritalStatus;
            this.age = age;
            this.growth = growth;
            this.weight = weight;
        }

        public Human(String name, Byte age, Byte growth, Byte weight) {
            this.name = name;
            this.age = age;
            this.growth = growth;
            this.weight = weight;
        }

        public Human(String name, Boolean sex, Byte age, Byte growth, Byte weight) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.growth = growth;
            this.weight = weight;
        }

        public Human(String name, Byte growth, Byte weight) {
            this.name = name;
            this.growth = growth;
            this.weight = weight;
        }

        public Human(String name, Boolean sex, Byte age, Byte weight) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.weight = weight;
        }
        public Human(String name, String maritalStatus, Byte age, Byte growth, Byte weight) {
            this.name = name;
            this.maritalStatus = maritalStatus;
            this.age = age;
            this.growth = growth;
            this.weight = weight;
        }
    }
}