package javaweek8homework;
/**
 * First And Last Digit Sum
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 */

import java.util.Scanner;

public class Programme7_FirstLastDigitSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = scanner.nextInt();
        sumFirstAndLastDigit(num);
    }

    public static int sumFirstAndLastDigit(int num) {

        int lastDigit = num % 10;

        if (num >= 0) {
            while (num >= 10) {
                num /= 10;
            }
        }else{

            System.out.println(-1 + "  Negative value is entered");
            return -1;
        }
        System.out.println("Sum is : " + (num + lastDigit));
        return (num + lastDigit);
    }
}
