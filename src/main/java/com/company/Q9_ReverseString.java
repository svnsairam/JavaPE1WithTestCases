package com.company;

import java.util.Scanner;

public class Q9_ReverseString {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        String      inputString = new String();
        inputString = scanner.nextLine();

        Q9_ReverseString myObj = new Q9_ReverseString();
        myObj.reverse(inputString);
    }


    public  String reverse(String inputString){
        StringBuilder result = new StringBuilder();
        for(int i=0;i<inputString.length();i++){
           result.append(inputString.charAt(inputString.length()-i-1));
        }

        return result.toString();

    }
}
