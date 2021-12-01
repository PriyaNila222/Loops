package com.company;

//Program to print odd and even number

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        if((number%2) == 0) {
            System.out.println("Given number is even number");
        } else {
            System.out.println("Given number is odd number");
        }
    }

}
