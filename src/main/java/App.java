/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Tyler Snowdon
 */

import java.util.Calendar;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String firstInput;
        String secondInput;
        int age;
        int retireAge;
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        Scanner reader = new Scanner(System.in);
        System.out.print("What is your current age? ");
        firstInput = reader.nextLine();
        System.out.print("At what age would you like to retire? ");
        secondInput = reader.nextLine();

        try {
            age = Integer.parseInt(firstInput);
            retireAge = Integer.parseInt(secondInput);
        } catch (Exception e) {
            System.out.println("Invalid input! Please run the program again and try a different value.");
            return;
        }

        int yearLeft = retireAge - age;

        System.out.println("You have " + yearLeft + " years left until you retire");
        System.out.println("It's " + currentYear + " so you can retire in " + (currentYear + yearLeft));
    }
}
