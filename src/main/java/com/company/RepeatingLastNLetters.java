package com.company;

import java.util.Scanner;

public class RepeatingLastNLetters {
    public static  void  main(String arg[]){
        Scanner     scanner = new Scanner(System.in);
        String      inputString = new String();
        inputString = scanner.nextLine();
        int     inputInt = scanner.nextInt();

        RepeatingLastNLetters repeatingLastNLetters = new RepeatingLastNLetters();
        repeatingLastNLetters.repeatLastNLetters(inputString, inputInt);

    }

    public String repeatLastNLetters(String inputString, int inputInt){
        int     difference = inputString.length()-inputInt;
        StringBuilder  result = new StringBuilder();
        result.append(inputString);
        for(int i=0;i<inputInt;i++){
            for(int j=difference;j<inputString.length();j++){
                result.append(inputString.charAt(j));
            }
        }

        return  result.toString();
    }

}
