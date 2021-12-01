package com.company;

//Program to check palindrome or not

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String originalString = scanner.nextLine();
        int stringLength = originalString.length();
        String reverseString = "";

        for (int value = stringLength - 1; value >= 0; value --) {
            reverseString += originalString.charAt(value);
        }

        if (originalString.equals(reverseString)) {
            System.out.println(originalString + " " + "is a palindrome");
        }else  {
            System.out.println(originalString + " " + "is not a palindrome");
        }
    }
}
