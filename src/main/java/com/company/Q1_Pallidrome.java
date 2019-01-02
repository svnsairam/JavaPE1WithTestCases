package com.company;

import java.util.Scanner;

public class Q1_Pallidrome {
    final static int   MAX = 25;
    public static void main(String ar[]){
        Scanner     sc = new Scanner(System.in);
        long    input = sc.nextLong();
        int     digits = numberOfDigits(input);
        long    powerOfTen  = (long)Math.pow(10,digits-1);
        boolean     ispalindrome = checkPallindrome(input, powerOfTen);
        long    tempInput = input;
        long    sum = 0;
        if(ispalindrome){
            while((tempInput%10)>0){
                if((tempInput%10)%2 == 0){
                    sum = sum + tempInput%10;
                    tempInput = tempInput/10;
                }else {
                    tempInput = tempInput/10;
                }
            }
            if(sum>MAX){
                System.out.println(input+ " "+"is palindrome and the sum of even numbers is greater than 25");
            }else {
                System.out.println(input+ " "+"is palindrome and sum of even numbers is less than 25");
            }
        }   else{
            System.out.println(input+ " "+"is not palindrome");
        }

    }

    public static boolean checkPallindrome(long input, long powerOfTen){
        long    reverseInput = 0;
        long    tempInput = input;
        while(tempInput%10 > 0){
            reverseInput = reverseInput + ((tempInput%10)* powerOfTen);
            tempInput = tempInput/10;
            powerOfTen = powerOfTen/10;
        }
        if(reverseInput == input) {
            return true;
        } else {
            return false;
        }
    }

    public static int numberOfDigits(long input){

        int     digits = 0;
        while(input%10 > 0){
            digits++;
            input = input/10;
        }
        return digits;
    }

}
