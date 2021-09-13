/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Avery Reyna
 */

package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // the user inputs the string they want to find the length of, which is printed in line 15
        Scanner input = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String inputString = input.nextLine();
        
        System.out.println(inputString + " has " + inputString.length() + " characters.");
    }
}