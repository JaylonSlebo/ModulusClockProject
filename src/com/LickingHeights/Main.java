package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ModulusClock();
    }{
}

    public static void ModulusClock() {
        int minutes;
        int hours;

        Scanner keyboard;

        keyboard = new Scanner(System.in);

        System.out.println("Type in an amount of hours");
        hours = keyboard.nextInt();




        System.out.println("Type in an amount of minutes");

        minutes = keyboard.nextInt();

        hours = minutes >= 60 ? hours+minutes/60 : hours;
        System.out.println(minutes%60);
        

        System.out.println("The time is "+ hours +":"+ minutes);

    }

    }