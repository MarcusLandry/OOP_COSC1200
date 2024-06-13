package Assignments.Assignment1;/*
Name: Marcus Landry
Program: Assignment 1 - Fundamentals
Date: 05/30/2024
Desc: Program calculates the maximum horizontal distance of a projectile
*/

import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args) {
        // set gravity as a const
        final double GRAVITY = 9.8;

        // User input for angle
        Scanner angleScanner = new Scanner(System.in);
        System.out.println("Enter the initial angle of the projectile in degrees: ");
        double angle;
        // checks input is a number
        if (angleScanner.hasNextDouble()) {
            angle = angleScanner.nextDouble();
            // checks the number is between 0-90
            if (angle < 0 || angle > 90) {
                System.out.println("Invalid input. Angle must be between 0 and 90 degrees.");
                return;
            }
            // Convert to radians
            angle = Math.toRadians(angle);
        } else {
            System.out.println("Invalid input. Please enter a valid number.");
            return;
        }

        // User input for velocity
        Scanner velocityScanner = new Scanner(System.in);
        System.out.println("Enter the initial velocity of the projectile(m/s): ");
        // checks input is a number
        double velocity;
        if (velocityScanner.hasNextDouble()) {
            velocity = Math.abs(velocityScanner.nextDouble());
        } else {
            System.out.println("Invalid input. Please enter a valid number. ");
            return;
        }

        // Calculating maximum horizontal distance
        double distance = (velocity * velocity * Math.sin(2 * angle)) / GRAVITY;

        // Output
        System.out.printf("The maximum horizontal distance of the projectile is: %.3f meters\n", distance);

    }

}