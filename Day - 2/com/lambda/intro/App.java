package com.lambda.intro;

public class App {
    public static void main(String[] args) {
        // Using the Calculator functional interface with lambda expressions
        //Addition
        Calculator addition = (n1, n2) -> n1 + n2;
        System.out.println("Addition: " + addition.calculator(10, 5));
        //Subtraction
        Calculator subtraction = (n1, n2) -> n1 - n2;
        System.out.println("Subtraction: " + subtraction.calculator(10, 5));
        //Multiplication
        Calculator multiplication = (n1, n2) -> n1 * n2;
        System.out.println("Multiplication: " + multiplication.calculator(10, 5));
        //Division
        Calculator division = (n1, n2) -> n1 / n2;
        System.out.println("Division: " + division.calculator(10, 5));
    }
}
