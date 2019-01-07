package com.company;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class CapitalSmallDigitSpecialLetter {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        char      charInput;
        System.out.println("Enter a charecter");
        charInput = scanner.nextLine().charAt(0);


    }

    public  String checkCapitalSmallDigitSpecialLetter(char charInput){

        StringBuilder result = new StringBuilder();

        if((charInput-'0') >=0 && (charInput-'0') <= 9){
            result.append("Number");
        }else if((charInput-'a') >=0 && (charInput-'z') <= 25){
            result.append("Small Letter");
        }else if((charInput-'A') >=0 && (charInput-'Z') <=25){
            result.append("Capital Letter");
        }else {
            result.append("Special Charecter");
        }

        return result.toString();
    }

}
