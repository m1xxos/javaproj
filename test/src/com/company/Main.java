package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code
        Scanner in = new Scanner(System.in);

        int x = 10, y = 12, z = 3;
        x += y - x++ * z;
        z = --x - y * 5;
        y /= x + 5 % z;
        z = x++ + y * 5;
        x = y - x++ * z;
        System.out.println("x = " + x + " y = " + y + " z = " + z);

        class ArithmeticAverage{
            public int t1 = 3, t2=4, t3=12;

            public void prnt(){
                int sr = (t1 + t2 + t3)/3;
                System.out.println("\np = " + sr);
            }

        }
        ArithmeticAverage arch = new ArithmeticAverage();
        arch.prnt();

        class Circle{
            final double PI = 3.14;

            public double plo(double r){
               return PI * Math.pow(r, 2);
            }
        }

        Circle circ = new Circle();
        System.out.println("\nПлощадь: " + circ.plo(3));

        class Volume{
            final double PI = 3.14;

            public double V, S, r, h;

            public double vol(){
                V = PI * Math.pow(r, 2) * h;
                return V;
            }

            public double sq(){
                S = 2 * PI * Math.pow(r, 2) + 2 * PI * r * h;
                return S;
            }
        }

        Volume vo = new Volume();
        vo.r = 3;
        vo.h = 12;
        System.out.println("\nОбъем V цилиндра: " + vo.vol());
        System.out.println("\nПлощадь S поверхности " + vo.sq());

        int _Identifier;
        //int uberflu?;
        //int \u006fIdentifier;
        //int &myVar;
        int myVariab1le;


        class Translator{
            public String slov(String sl){
                return switch (sl) {
                    case "погода" -> "weather";
                    case "холодный" -> "cold";
                    case "облако" -> "cloud";
                    case "небо" -> "sky";
                    case "теяплый" -> "warm";
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
        System.out.print("Введите слово: ");
        String sl = in.nextLine();
        System.out.println(trans.slov(sl));

    }
}
