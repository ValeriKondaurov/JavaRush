package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    private String name;
    private int weight;
    private int age;
    private String color;
    private String address;

    public Cat (String name) {
        this.name = name;
        this.age = 5;
        this.weight = 10;
        this.color = "white";
    }

    public Cat (String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 10;
        this.color = "white";
    }

    public Cat (String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "white";
    }

    public Cat (int weight, String color) {
        this.age = 10;
        this.color = color;
        this.weight = weight;
    }

    public Cat (int weight, String color, String address) {
        this.age = 10;
        this.color = color;
        this.weight = weight;
        this.address = address;
    }
    public static void main(String[] args) {

    }
}
