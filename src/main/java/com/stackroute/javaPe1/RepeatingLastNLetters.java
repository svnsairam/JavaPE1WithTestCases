/*
Write a program for the following condition:
Given 2 inputs , where input1 is string and input 2 is integer value,
the last n characters should repeat n number of times in the output String.
Input1:            Stackroute
Input2:            5
Output1:           Stackrouterouterouterouterouteroute
 */
package com.stackroute.javaPe1;

import java.util.Scanner;

public class RepeatingLastNLetters {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        String inputString = new String();
        inputString = scanner.nextLine();
        int inputInt = scanner.nextInt();
        RepeatingLastNLetters repeatingLastNLetters = new RepeatingLastNLetters();
        repeatingLastNLetters.repeatLastNLetters(inputString, inputInt);
    }

    public String repeatLastNLetters(String inputString, int inputInt) {
        int difference = inputString.length() - inputInt;
        StringBuilder result = new StringBuilder();
        result.append(inputString);
        for (int i = 0; i < inputInt; i++) {
            for (int j = difference; j < inputString.length(); j++) {
                result.append(inputString.charAt(j));
            }
        }
        return result.toString();
    }
}
