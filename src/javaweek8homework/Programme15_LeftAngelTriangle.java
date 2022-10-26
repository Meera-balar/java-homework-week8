package javaweek8homework;
/**
 * Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */

import java.util.Scanner;

public class Programme15_LeftAngelTriangle {
    public static void main(String[] args) {
        leftAngelTriangle();
    }
    public static void leftAngelTriangle(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of rows : ");
        int n = scanner.nextInt();
        for (int j = 1; j <= n; j++) {

            for (int i = 1; i<=n- j; i++) {
                System.out.print("  ");
            }
            for(int k=1;k<=j;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();


    }
}
