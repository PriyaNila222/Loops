package com.company;

//Program to find amstrong number or not

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int originalNumber = scanner.nextInt();
        int result = 0;
        int temporaryNumber = 0;
        int remainder;
        int incrementNumber = 0;

        temporaryNumber = originalNumber;
        while (temporaryNumber > 0) {
            temporaryNumber = temporaryNumber / 10;
            incrementNumber++;
        }

        temporaryNumber = originalNumber;
        while (temporaryNumber > 0) {
            remainder = temporaryNumber % 10;
            result += Math.pow(remainder, incrementNumber);
            temporaryNumber = temporaryNumber / 10;
        }

        if (result == originalNumber) {
            System.out.println(originalNumber +" " + "is a Amstrong number");
        } else {
            System.out.println(originalNumber +" " + "is not a Amstrong number");
        }


    }
}
