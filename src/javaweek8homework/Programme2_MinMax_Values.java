package javaweek8homework;
/**
 * Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */

import java.util.Scanner;

public class Programme2_MinMax_Values {
    public static void main(String[] args) {
        valuesMinOrMax();
    }

    public static void valuesMinOrMax() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a number (or 0 to stop): ");
        int number = scanner.nextInt();
        int max = number;
        int min = number;

        while (number != 0) {
            if (number > max) {
                max = number;
            } else if (number < min) {
                min = number;
            }
            System.out.print("Type a number (or 0 to stop): ");
            number = scanner.nextInt();
        }

        if (max != 0 && min != 0) {
            System.out.println("Maximum was " + max);
            System.out.println("Minimum was " + min);
        }

    }
}
