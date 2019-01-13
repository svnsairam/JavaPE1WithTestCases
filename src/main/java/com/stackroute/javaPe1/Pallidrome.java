/*
Write a program which accepts a number as input and check whether the given number is palindrome or not If it is a palindrome then
a. Add all the even numbers and check whether the sum is more than 25.
b. Print success and failure messages for all 3 conditions
Input : 2468642
Output : 2468642 is palindrome and the sum of even numbers is greater than 25
Input: 12345
Output: 12345 is not palindrome
Input: 12345654321
Output : 12345654321 is palindrome and sum of even numbers is less than 25
 */
package com.stackroute.javaPe1;

import java.util.Scanner;

public class Pallidrome {
    final static int MAX = 25;

    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        long input = sc.nextLong();
        int digits = numberOfDigits(input);
        long powerOfTen = (long) Math.pow(10, digits - 1);
        boolean ispalindrome = checkPallindrome(input, powerOfTen);
        long tempInput = input;
        long sum = 0;
        if (ispalindrome) {
            while ((tempInput % 10) > 0) {
                if ((tempInput % 10) % 2 == 0) {
                    sum = sum + tempInput % 10;
                    tempInput = tempInput / 10;
                } else {
                    tempInput = tempInput / 10;
                }
            }
            if (sum > MAX) {
                System.out.println(input + " " + "is palindrome and the sum of even numbers is greater than 25");
            } else {
                System.out.println(input + " " + "is palindrome and sum of even numbers is less than 25");
            }
        } else {
            System.out.println(input + " " + "is not palindrome");
        }
    }

    public static boolean checkPallindrome(long input, long powerOfTen) {
        long reverseInput = 0;
        long tempInput = input;
        while (tempInput % 10 > 0) {
            reverseInput = reverseInput + ((tempInput % 10) * powerOfTen);
            tempInput = tempInput / 10;
            powerOfTen = powerOfTen / 10;
        }
        if (reverseInput == input) {
            return true;
        } else {
            return false;
        }
    }

    public static int numberOfDigits(long input) {
        int digits = 0;
        while (input % 10 > 0) {
            digits++;
            input = input / 10;
        }
        return digits;
    }
}
