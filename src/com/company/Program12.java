package com.company;

//Program to print gender(M/F) using switch

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the gender(M/F): ");
        String gender = scanner.nextLine();

        switch (gender) {
            case "M":
                System.out.println("Gender is Male");
                break;
            case "F":
                System.out.println("Gender is female");
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
