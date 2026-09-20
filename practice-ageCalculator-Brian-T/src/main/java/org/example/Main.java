package org.example;
import java.util.Scanner;

// -------------------- Age Calculator -------------------- //

//  Instructions:
//
//  Write a Java program that prompts the user to enter their age and then prints a
//  message to the console that tells them how many years they have until they are
//  100 years old.
//
//  Your program should:
//        ● Take in an age from the user.
//        ● Calculate the years left until they are 100 years old.
//        ● Return a message to tell the user many many years they have until they are 100.

// ------------------------------------------------------- //

public class Main {
    static void main() {

        // Creates a Scanner object to read the users input
        Scanner scanner = new Scanner(System.in);

        // Asks the user for their age
        System.out.print("Please Enter Your Age: ");

        // Stores the user's input as the age variable
        int age = scanner.nextInt();

        // Calculates how many years until 100yrs old
        int yearsUntilOneHundred = 100 - age;

        // Display's the Message
        System.out.println("You have " + yearsUntilOneHundred + " years until you are 100 years old!");

    }
}
