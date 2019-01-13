/*
Write a program using a loop to print the following output. 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6       6 6 . . . nth iteration.
 Input: 5
 Output : 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5
 */
package com.stackroute.javaPe1;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        NumberPattern numberPattern = new NumberPattern();
        numberPattern.printSeries(input);
    }

    public String printSeries(int input) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                result.append(i + " ");
            }
        }
        return result.toString();
    }
}

