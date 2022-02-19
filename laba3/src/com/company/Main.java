package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        class SumMin{
            public int summer(int a, int b){
                int summ = 0;
                for(int i=a + 1; i<b; i++){
                    summ += i;
                }
                return summ;
            }
        }
        Scanner in = new Scanner(System.in);

        var test = new SumMin();
        System.out.println("2 числа: ");
        int a = Integer.parseInt(in.nextLine());
        int b = Integer.parseInt(in.nextLine());
        System.out.println(test.summer(a,b));
    }
}
