package com.company;

import java.util.Scanner;

public class PrintTomOrJerry {
    public static void main(String ar[]) {
        System.out.println("Enter digit between 20 to 30");
        Scanner     scanner = new Scanner(System.in);
        int    input = scanner.nextInt();

        PrintTomOrJerry printTomOrJerry = new PrintTomOrJerry();
        printTomOrJerry.evaluate(input);
    }

    public String evaluate(int value){
        int    input = value;
        if((input%2==0) && (input >= 20)
                && (input<=30)){
            return "Tom";
        } else {
            return "Jerry";
        }
    }
}
