/*
Write a program which accepts a number as input from user and perform the following:
a. sort the number in non-increasing order
b. after sorting sum all the even numbers, the sum should be greater than 15 .
c. if sum is more than 15,then print output as true or false.
Input  : 234534
Output : Sorted number in non-increasing order : 544332
 */
package com.stackroute.javaPe1;

import java.util.Scanner;

public class SortNumberInDecreasingOrder {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to sort");
        int inputInt = 0;
        inputInt = scanner.nextInt();
    }

    public String sortNumberInDecreaseingOrder(int inputInt) {
        int array[] = new int[10];
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            array[i] = 0;
        }
        while (((inputInt % 10) > 0) || (inputInt > 0)) {
            array[inputInt % 10]++;
            inputInt = inputInt / 10;
        }
        for (int i = 9; i >= 0; i--) {
            while (array[i] > 0) {
                result.append(i);
                if ((i % 2) == 0)
                    array[i]--;
            }
        }
        return result.toString();
    }

    public boolean addTheEvenDigits(int inputInt) {
        float sum = 0;
        int array[] = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = 0;
        }
        while (((inputInt % 10) > 0) || (inputInt > 0)) {
            array[inputInt % 10]++;
            inputInt = inputInt / 10;
        }
        for (int i = 9; i >= 0; i--) {
            while (array[i] > 0) {
                if ((i % 2) == 0)
                    sum = sum + i;
                array[i]--;
            }
        }
        if (sum > 15) {
            System.out.println("Sum of even numbers :" + sum);
            return true;
        } else {
            System.out.println("Sum of even numbers :" + sum);
            return false;
        }
    }
}