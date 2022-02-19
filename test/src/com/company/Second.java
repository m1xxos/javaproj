package com.company;

import java.util.Scanner;

public class Second {

    public static void second(String[] args) {
        Scanner in = new Scanner(System.in);

        class Translator{
            public String slov(String sl){
                return switch (sl) {
                    case "погода" -> "weather";
                    case "холодный" -> "cold";
                    case "облако" -> "cloud";
                    case "небо" -> "sky";
                    case "теплый" -> "warm";
                    case "солнце" -> "sun";
                    case "сухой" -> "dry";
                    case "жаркий" -> "hot";
                    case "луна" -> "moon";
                    case "мороз" -> "frost";
                    default -> "такого слова нету(";
                };
            }
        }

        Translator trans = new Translator();
        System.out.println(trans.slov("сухой"));


    }
}
