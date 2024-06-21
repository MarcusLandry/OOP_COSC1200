package Assignments.Assignment2;
/*
Name: Marcus Landry
Program: Assignment 2 - Iterations & Arrays
Date: June 21, 2024
Desc: Program to create a temperature
*/

import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of days (1 - 31): ");
        int totalDays = scanner.nextInt();

        // initializing all the variables and arrays
        double[] lowTemperature = new double[totalDays];
        double[] highTemperature = new double[totalDays];
        double overallAverage = 0;
        double lowestTemp = Double.MAX_VALUE;
        double highestTemp = Double.MIN_VALUE;
        int overallLowestTempDay = 0;
        int overallHighestTempDay = 0;

        // User input for temps
        for (int day = 0; day < totalDays; day++) {
            boolean validInput = false;
            while (!validInput) {
                System.out.println("Enter lowest temperature of the day (-30 to 30): ");
                double lowTemp = scanner.nextDouble();
                System.out.println("Enter lowest temperature of the day (-30 to 30): ");
                double highTemp = scanner.nextDouble();

                if (lowTemp >= -30 && lowTemp <= 30 && highTemp >= -30 && highTemp <= 30 && lowTemp <= highTemp) {
                    lowTemperature[day] = lowTemp;
                    highTemperature[day] = highTemp;
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a number between -30 and 30");
                }

            }

            

        }




    }

}
