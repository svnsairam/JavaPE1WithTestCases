package com.company;

import java.util.Scanner;

public class Q4_NumberPattern {
    public static void main(String arg[]){
        Scanner     scanner = new Scanner(System.in);
        int     input = scanner.nextInt();

        Q4_NumberPattern myObj = new Q4_NumberPattern();
        myObj.printSeries(input);
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

