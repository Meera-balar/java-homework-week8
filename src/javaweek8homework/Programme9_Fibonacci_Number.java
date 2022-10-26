package javaweek8homework;
//Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
import java.util.Scanner;

public class Programme9_Fibonacci_Number {
    public static void main(String[] args) {
        fibonacciNumber();
    }

    public static void fibonacciNumber() {
        int a1 = 0;
        int a2 = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci Series up to which number you want : ");
        int n = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= n; i++) {
            int a3 = a1 + a2;
                System.out.print(a1 + " "); //first number
                //compute next number
                a1 = a2;
                a2 = a3;
            }

        }

    }

