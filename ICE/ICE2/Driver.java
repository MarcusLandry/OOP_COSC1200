/*
Name: Marcus Landry
Program: COSC1200
Date: 06/13/2024
Description: ICE2 - practice using functions, driver
*/
package ICE.ICE2;

public class Driver {

    public static void main(String[] args) {

    // call drawStars
    ICE2.drawStars(15);

    //call printStatement
    ICE2.printStatement("In Class Exercise 2: Practicing with Methods");

    //call multiplyNumbers with non-decimal values
    int value = ICE2.multiplyNumbers(4,5);
    System.out.println("Product of 4x5 = " + value);

    //call multiplyNumbers with non-decimal values
    double dbValue = ICE2.multiplyNumbers(4.5,5.5);
    System.out.println("Product of 4.5x5.5 = " + dbValue);

    //S. Call isPalindrome()
    System.out.println("Is 'civic' a palindrome? " + ICE2.isPalindrome("civic"));
    System.out.println("Is 'COSC1200' a palindorme? " + ICE2.isPalindrome("COSC1200"));

    }

}
