package com.javarush.task.task14.task1421;

public  class Singleton {
    private static Singleton instance;
    private Singleton () {
    }

    public static Singleton getInstance() {
        if (!(instance instanceof Singleton)) instance = new Singleton();
        return instance;
    }
}
