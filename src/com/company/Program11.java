package com.company;

//Program to check number is even or odd using switch

import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        switch (number%2) {
            case 0:
                System.out.println(number + " " + "is a even number");
                break;
            case 1:
                System.out.println(number + " " + "is a odd number");
        }
    }
}
