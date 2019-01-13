/*
Write a program that takes a character from the user as input and determines whether the character entered is a capital letter, a small case letter, a digit or a special symbol and display appropriately.
Input:  A
Output:  Capital letter
 */
package com.stackroute.javaPe1;

public class CapitalSmallDigitSpecialLetter {
    public String checkCapitalSmallDigitSpecialLetter(char charInput) {
        StringBuilder result = new StringBuilder();
        if ((charInput - '0') >= 0 && (charInput - '0') <= 9) {
            result.append("Number");
        } else if ((charInput - 'a') >= 0 && (charInput - 'z') <= 25) {
            result.append("Small Letter");
        } else if ((charInput - 'A') >= 0 && (charInput - 'Z') <= 25) {
            result.append("Capital Letter");
        } else {
            result.append("Special Charecter");
        }
        return result.toString();
    }
}
