package com.company;

//Program to find equal and not equal operator

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println(firstNumber + "==" + secondNumber + ":" + (firstNumber == secondNumber) );
        System.out.println(firstNumber + "!=" + secondNumber + ":" + (firstNumber != secondNumber) );
    }
}
