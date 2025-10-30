package com.interfaces;

public class CasioCalculator implements Calculator {
    // Assuming some fields for the calculator
    // These could be used for storing state or configuration
    int a;
    int b;
    
    @Override
    public void add() {
        System.out.println("Performing addition in CasioCalculator");
        int a = 10;
        int b = 20;
        int result = a + b;
        System.out.println("Result: " + result);
    }
    @Override
    public void subtract() {
        System.out.println("Performing subtraction in CasioCalculator");
        int a = 10;
        int b = 20;
        int result = a - b;
        System.out.println("Result: " + result);
    }
    @Override
    public void multiply() {
        System.out.println("Performing multiplication in CasioCalculator");
        int a = 10;
        int b = 20;
        int result = a * b;
        System.out.println("Result: " + result);
    }
    @Override
    public void divide() {
        System.out.println("Performing division in CasioCalculator");
        int a = 10;
        int b = 20;
        int result = a / b;
        System.out.println("Result: " + result);
    }
}
