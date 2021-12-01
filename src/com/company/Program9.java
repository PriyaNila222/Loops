package com.company;

//Program to find prime number or not

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        boolean isPrime = true;
        int result;

        for(int value = 2; value <= (number/2); value++) {
            result = number % value;
            if (result == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " " + "is a prime number");
        } else  {
            System.out.println(number + " " + "is not a prime number");
        }
    }
}
