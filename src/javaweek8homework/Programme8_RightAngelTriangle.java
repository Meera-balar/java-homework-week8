package javaweek8homework;
/**
 * Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

import java.util.Scanner;

public class Programme8_RightAngelTriangle {
    public static void main(String[] args) {
        rightAngelTriangle();
    }
    public static void rightAngelTriangle(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of rows : ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("@ ");

            }
            System.out.println("");
        }
        scanner.close();


    }
}
