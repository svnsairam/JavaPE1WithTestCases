package com.company;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String arg[]){
        Scanner     scanner = new Scanner(System.in);
        int     input = scanner.nextInt();

        NumberPattern numberPattern = new NumberPattern();
        numberPattern.printSeries(input);
    }

    public  String printSeries(int input){
        StringBuilder result = new StringBuilder();
        for (int i=1;i<=input;i++){
            for (int j=1;j<=i;j++){
                result.append(i+" ");
            }
        }

        return result.toString();


    }

}

