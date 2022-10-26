package javaweek8homework;
/**
 * Palindrome Number
 * Write a method called isPalindrome with one int parameter called number.
 * The method needs to return a boolean.
 * It should return true if the number is a palindrome number otherwise it should return false.
 * Check the tips below for more info about palindromes.
 * Example Input/Output
 * isPalindrome(-1221); → should return true
 * isPalindrome(707); → should return true
 * isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to
 * 11212.
 */

import java.util.Scanner;

public class Programme5_NumberPalindrome {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        isPalindrome(number);
    }

    public static boolean isPalindrome(int number){

        int reverse = 0;
        int originalNumber = number;

        while (number !=0){
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }
        System.out.println(originalNumber == reverse);
        return originalNumber == reverse;
    }
}
