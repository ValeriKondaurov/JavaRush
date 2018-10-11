package com.javarush.task.task05.task0511;

/* 
Создать класс Dog
*/

public class Dog {
    private String name;
    private int height;
    private String color;

    public void initialize (String name) {
        this.name = name;
        this.height = 0;
        this.color = null;
    }

    public void initialize (String name, int height) {
        this.name = name;
        this.height = height;
        this.color = null;
    }

    public void initialize (String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }
    public static void main(String[] args) {

    }
}
