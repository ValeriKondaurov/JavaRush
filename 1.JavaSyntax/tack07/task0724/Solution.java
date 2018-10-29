package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human human1 = new Human("H1", true, 50);
        Human human2 = new Human("H2", false, 52);
        Human human3 = new Human("H3", true, 42);
        Human human4 = new Human("H4", false, 40);

        Human human5 = new Human("H5", false, 10, human1, human2);
        Human human6 = new Human("H6", true, 12, human3, human2);
        Human human7 = new Human("H7", false, 14, human3, human4);
        Human human8 = new Human("H8", true, 16, human1, human4);
        Human human9 = new Human("H9", false, 11, human1, human4);
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(human4);
        System.out.println(human5);
        System.out.println(human6);
        System.out.println(human7);
        System.out.println(human8);
        System.out.println(human9);
    }

    public static class Human {
        private String name;
        private int age;
        private boolean sex;
        private Human father;
        private Human mother;

        Human (String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = null;
            this.mother = null;
        }

        Human (String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}