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
                System.out.printf("Day %d:\n", day + 1);
                System.out.println("Enter lowest temperature of the day (-30 to 30): ");
                double lowTemp = scanner.nextDouble();
                System.out.println("Enter highest temperature of the day (-30 to 30): ");
                double highTemp = scanner.nextDouble();

                if (lowTemp >= -30 && lowTemp <= 30 && highTemp >= -30 && highTemp <= 30 && lowTemp <= highTemp) {
                    lowTemperature[day] = lowTemp;
                    highTemperature[day] = highTemp;
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a number between -30 and 30 \n" +
                            "for both temperatures, and ensure low temperature is not higher than high temperature.");
                }

            }

            // calculating the temp for the day
            double averageDayTemperature = (lowTemperature[day] + highTemperature[day]) / 2;
            System.out.printf("Average temperature for day %d: %.1f\n", day + 1, averageDayTemperature);

            // updates the lists of averages
            overallAverage += averageDayTemperature;
            if (lowTemperature[day] < lowestTemp) {
                lowestTemp = lowTemperature[day];
                overallLowestTempDay = day + 1;
            }

            if (highTemperature[day] > highestTemp) {
                highestTemp = highTemperature[day];
                overallHighestTempDay = day + 1;
            }

        }

        // total avg temp
        overallAverage /= totalDays;

        // outputs final results to console
        System.out.printf("\nOverall Average Temperature: %.1f", overallAverage);
        System.out.printf("\nDay with the lowest temperature: %d", overallLowestTempDay);
        System.out.printf("\nDay with the highest temperature: %d", overallHighestTempDay);


    }

}
