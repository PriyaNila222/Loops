package com.company;

//Program to find largest of three numbers 10,20 and 30

public class Program13 {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 20;
        int thirdNumber = 30;

        if((firstNumber >= secondNumber) && (firstNumber >= thirdNumber)) {
            System.out.println(firstNumber + " " + "is the largest number");
        } else if ((secondNumber >= firstNumber) && (secondNumber >= thirdNumber)) {
            System.out.println(secondNumber + " " + "is the largest number");
        } else {
            System.out.println(thirdNumber + " " + "is the largest number");
        }
    }
}
