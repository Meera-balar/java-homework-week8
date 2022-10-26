package javaweek8homework;
/**
 * Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 */

import java.util.Scanner;

public class Programme13_SharedDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number1 : ");
        int number1 = scanner.nextInt();
        System.out.print("Enter Number2 : ");
        int number2 = scanner.nextInt();
        System.out.println(sharedDigit(number1,number2));
    }

    public static boolean sharedDigit(int number1, int number2) {
        if ((number1 < 10 || number1 >99 )||( number2 < 10 && number2 > 99) ) {
            return false;
        } else if (number1==number2) {
            return true;
        } else if ( (number1 / 10 == number2 / 10) || (number1 % 10 == number2 % 10)||(number1%10==number2/10)||(number2%10==number1/10)) {
           return true;
        }else{
            return false;
        }


    }
}

