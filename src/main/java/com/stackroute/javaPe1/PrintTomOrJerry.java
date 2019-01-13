/*
Write a program which accepts an integer number as input from the user and perform the following conditional checks:
a. Print Tom if number is odd and exists between 20 to 30
b. Print Jerry, if number is even and exists between 20 and 30
 */
package com.stackroute.javaPe1;

import java.util.Scanner;

public class PrintTomOrJerry {
    public static void main(String ar[]) {
        System.out.println("Enter digit between 20 to 30");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        PrintTomOrJerry printTomOrJerry = new PrintTomOrJerry();
        printTomOrJerry.evaluate(input);
    }

    public String evaluate(int value) {
        int input = value;
        if ((input % 2 == 0) && (input >= 20)
                && (input <= 30)) {
            return "Tom";
        } else {
            return "Jerry";
        }
    }
}
