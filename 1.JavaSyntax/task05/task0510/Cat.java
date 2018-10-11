package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    private String name = null;
    private int age = 0;
    private int weight = 0;
    private String color = null;
    private String address = null;

    public void initialize (String name) {
        this.name = name;
        this.age = 5;
        this.weight = 10;
        this.color = "white";
    }

    public void initialize (String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 10;
        this.color = "white";
    }

    public void initialize (String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "white";
    }

    public void initialize (int weight, String color) {
        this.name = null;
        this.age = 10;
        this.color = color;
        this.weight = weight;
    }

    public void initialize (int weight, String color, String address) {
        this.age = 10;
        this.color = color;
        this.weight = weight;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
