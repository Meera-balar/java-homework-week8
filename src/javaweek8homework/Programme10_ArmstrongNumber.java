package javaweek8homework;
/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */

import java.util.Scanner;

public class Programme10_ArmstrongNumber {
    public static void main(String[] args) {
        armstrongNumber();
    }

    public static void armstrongNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = scanner.nextInt();
        int rem,arm =0;
        int a=num;
        while(num>0){
            rem=num%10;
            arm=(rem*rem*rem)+arm;
            num=num/10;
        }
        if(a==arm){
            System.out.println(a+ " is Armstrong Number");
        } else{
            System.out.println(a+ " is Not Armstrong Number");

        }

    }
}
