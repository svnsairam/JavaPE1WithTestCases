/*
Write a program to reverse any string without using String Buffer.
Input : london
Output : nodnol
 */
package com.stackroute.javaPe1;

import java.util.Scanner;

public class ReverseString {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        String inputString = new String();
        inputString = scanner.nextLine();
        ReverseString reverseString = new ReverseString();
        reverseString.reverse(inputString);
    }

    public String reverse(String inputString) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            result.append(inputString.charAt(inputString.length() - i - 1));
        }
        return result.toString();
    }
}
