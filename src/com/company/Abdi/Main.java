package com.company.Abdi;

import java.util.*;

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("hello, world");

        int age = 15;
        double gpa = 4.1;
        boolean isRaining = false;

        String city = "columbus";

        System.out.println(city);

        System.out.println(city.toUpperCase());

        int dailyHighs[]= {50,60,70,80,90};
        System.out.println(dailyHighs[0]);
        System.out.println(dailyHighs[1]);
        System.out.println(dailyHighs[2]);
        System.out.println(dailyHighs[3]);
        System.out.println(dailyHighs[4]);

        for(int i = 0; i<=4; i++){
            System.out.println(dailyHighs[i]);
        }

        int twoDArray[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        System.out.println(twoDArray[0][1]);
        System.out.println(twoDArray[2][2]);


        int sum =2+3;
        System.out.println(sum);

        System.out.println("Hi, what is your name?");
        String name = input.nextLine();

        System.out.println("hello "+name);


    }


}
