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
        minutes =minutes%60;
        hours = hours%12;
        hours = hours ==0 ? 12 : hours;

        

        System.out.printf("The time is: %d:%02d",hours,minutes);

    }

    }