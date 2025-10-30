package com.interfaces;

import java.util.Scanner;

public class EpsonCalculator implements Calculator{
    int a;
    int b;
    Scanner scan = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("Performing addition in CasioCalculator");
        System.out.println("Enter two numbers to Add:");
        int a = scan.nextInt(); // Assuming user input for a
        int b = scan.nextInt(); // Assuming user input for b
        int result = a + b;
        System.out.println("Result: " + result);
    }

    @Override
    public void subtract() {
        System.out.println("Performing subtraction in CasioCalculator");
        System.out.println("Enter two numbers to Subtract:");
        int a = scan.nextInt(); // Assuming user input for a
        int b = scan.nextInt(); // Assuming user input for b
        int result = a - b;
        System.out.println("Result: " + result);
    }

    @Override
    public void multiply() {
        System.out.println("Performing multiplication in CasioCalculator");
        System.out.println("Enter two numbers to multiply:");
        int a = scan.nextInt(); // Assuming user input for a
        int b = scan.nextInt(); // Assuming user input for b
        int result = a * b;
        System.out.println("Result: " + result);
    }

    @Override
    public void divide() {
        System.out.println("Performing division in CasioCalculator");
        System.out.println("Enter two numbers to Divide:");
        int a = scan.nextInt(); // Assuming user input for a
        int b = scan.nextInt(); // Assuming user input for b
        int result = a / b;
        System.out.println("Result: " + result);
    }
}
