package com.StringOfArgs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Check if 5 arguments are provided
        if (args.length != 5) {
            System.out.println("Please provide exactly 5 numbers as command-line arguments.");
            return;
        }

        int sum = 0;

        // Convert arguments to integers and add them
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }

        // Display the sum
        System.out.println("Sum of the 5 numbers: " + sum);
    }
}