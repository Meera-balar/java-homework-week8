package javaweek8homework;
/**
 * Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 */

import java.util.Scanner;

public class Programme11_EvenSumDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int number = scanner.nextInt();

        System.out.println(getEvenDigitSum(number));
    }
    public static int getEvenDigitSum(int number) {
        int sumEvenDigits = 0;
        if (number < 0){
            //System.out.println(-1 + " Number Invalid");
            return -1;
        }


        while (number > 0) {
            int evenDigits = number % 10; //reminder //252/10 = 25.2 // 2 is reminder
            if (evenDigits % 2 == 0 )
                sumEvenDigits += evenDigits; //2+2 = 4
            number /= 10; //4/10 = 0.4
        }

        return sumEvenDigits;
    }

}



