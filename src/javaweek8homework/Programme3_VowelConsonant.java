package javaweek8homework;
/**
 * Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */

import java.util.Scanner;
public class Programme3_VowelConsonant {

    public static void main(String[] args) {
        alphabetVowelConsonant();
    }
    public static void alphabetVowelConsonant() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entered any single character from the alphabet: ");
        String letter = scanner.next();

        if (letter.length() == 1 && Character.isAlphabetic(letter.charAt(0))) {
            char ch = Character.toLowerCase(letter.charAt(0));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Entered letter is Vowel");
            } else {
                System.out.println("Entered letter is Consonant");
            }
        } else {
            System.out.println("Invalid letter entered.");
        }
    }


}
