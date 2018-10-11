package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat tomCat = new Cat("Tom", 10, 5   );
        Dog samDog = new Dog ("Sam", "bouldog", 10);
        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static  class Dog {
        String name;
        String type;
        int age;

        public Dog (String name, String type, int age) {
            this.name = name;
            this.type = type;
            this.age = age;
        }
    }

    public static  class Cat {
        String name;
        int weight;
        int age;

        public Cat (String name, int weight, int age) {
            this.name = name;
            this.weight= weight;
            this.age = age;
        }
    }
}
