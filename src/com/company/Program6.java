package com.company;

//Program to print even numbers between 10 to 100 using while loop

public class Program6 {
    public static void main(String[] args) {
        for(int number = 10; number <= 100; number++) {
            while ((number%2) == 0) {
                System.out.println(number);
                number++;
            }
        }
    }
}
