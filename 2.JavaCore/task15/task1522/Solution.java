package com.javarush.task.task15.task1522;

/*
Закрепляем паттерн Earth
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }
   static  {
       readKeyFromConsoleAndInitPlanet();
   }



    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String valuePlanet = reader.readLine();
            if (valuePlanet.equals(Planet.EARTH))
                thePlanet = Earth.getInstance();
            else if (valuePlanet.equals(Planet.MOON))
                thePlanet = Moon.getInstance();
            else if (valuePlanet.equals(Planet.SUN))
                thePlanet = Sun.getInstance();
            else thePlanet = null;

        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}
