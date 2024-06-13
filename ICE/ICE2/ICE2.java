/*
Name: Marcus Landry
Program: COSC1200
Date: 06/13/2024
Description: ICE2 - practice using functions
*/

package ICE.ICE2;

public class ICE2 {

    /**
     * This function prints the start equal value of its parameter
     * @param n
     */
    public static void drawStars(int n) {

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }

        System.out.println();

    }

    /**
     * This method simply display the console output of the passed string
     * @param statement
     */
    public static void printStatement(String statement) {

        System.out.println(statement);

    }

    /**
     * This method takes in two integers and returns their product
     * @param a
     * @param b
     * @return
     */
    public static int multiplyNumbers(int a, int b) {

        return a * b;

    }

    /**
     * This method takes in two doubles and returns their product
     * @param a
     * @param b
     * @return
     */
    public static double multiplyNumbers(double a, double b) {

        return a * b;

    }

    /**
     * This method calls overloaded isPalindrome(str, int, int)
     * @param str
     * @return
     */
    public static boolean isPalindrome(String str) {
        // convert all to lowercase
        str = str.toLowerCase();
        return isPalindrome(str, 0, str.length() - 1);

    }

    /**
     * Recursive method to determine if a source string is a palindrome
     * @param str
     * @param leftIndex
     * @param rightIndex
     * @return
     */
    private static boolean isPalindrome(String str, int leftIndex, int rightIndex) {

        //base case
        if(leftIndex >= rightIndex) return true;

        //check if characters at left and right index are different
        if(str.charAt(leftIndex) != str.charAt(rightIndex)) return false;

        //recursive case
        return isPalindrome(str, leftIndex + 1, rightIndex - 1);

    }

}
