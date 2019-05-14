package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key = reader.readLine();
        ArrayList <String> listMovie = new ArrayList<>();
        while ("soapOpera".equals(key) || "cartoon".equals(key) || "thriller".equals(key)) {
            listMovie.add(key);
            key = reader.readLine();
        }
        Movie movie = MovieFactory.getMovie(key);
        for (String s:listMovie) {
            movie = MovieFactory.getMovie(s);
            System.out.println(movie.getClass().getSimpleName());
        }
        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            } else if ("cartoon".equals(key)) {
                movie = new Cartoon();
            } else if ("thriller".equals(key)) {
                movie = new Thriller();
            }

            //напишите тут ваш код, пункты 5,6

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Thriller extends Movie {
    }

    static class Cartoon extends Movie {
    }
}
