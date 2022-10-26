package javaweek8homework;
/**
 * Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */

import java.util.Scanner;

public class Programme12_PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int num = scanner.nextInt();
        primeNumber(num);
    }
    public static void primeNumber(int num) {
        int count = 0;
        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0){
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(num + "  is Prime Number.");
            } else {
                System.out.println(num + " is Not Prime Number.");
            }

        } else {
            System.out.println("Number should be >1 and Positive number");
        }
    }
}
