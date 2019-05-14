package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader file = new FileReader(reader.readLine());
        reader.close();
        String str = "";
        while (file.ready()) {
            str += (char)file.read();
        }
        file.close();
        Document htmlDoc = Jsoup.parse(str,  "", Parser.xmlParser());
        Elements elem = htmlDoc.select(args[0]);
        for (Element element : elem) {
            System.out.println(element.outerHtml());
        }

    }


}
