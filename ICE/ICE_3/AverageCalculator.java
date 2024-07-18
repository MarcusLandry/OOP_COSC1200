/*
Name: Marcus Landry/100646671
Program: Average Calculator
Date: July 18, 2024
Desc: This program will calculate the average of all numbers inputted
*/

import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberAmount = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter the amount of numbers you wish to enter: ");
                String input = sc.nextLine();
                numberAmount = Integer.parseInt(input);

                if (numberAmount <= 0) {
                    throw new IllegalArgumentException("Please enter a positive integer.");
                }

                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            } catch (IllegalArgumentException e) {
                System.out.println("Please enter a positive integer.");
            }
        }

        int sum = 0;
        for (int i = 1; i <= numberAmount; i++) {
            boolean validNumber = false;
            while (!validNumber) {
                try {
                    System.out.print("Please enter number " + i + ": ");
                    String numberStr = sc.nextLine();
                    int number = Integer.parseInt(numberStr);

                    if (number < 0) {
                        throw new IllegalArgumentException("Please enter a positive number.");
                    }

                    sum += number;
                    validNumber = true;
                } catch (NumberFormatException e) {
                    System.out.println("Error: Please enter a valid integer.");
                    sc.nextLine();
                } catch (IllegalArgumentException e) {
                    System.out.println("Please enter a positive number.");
                    sc.nextLine();
                }
            }
        }

        double average = (double) sum / numberAmount;
        System.out.println("Average of the entered numbers: " + average);

    }
}
