package com.array.Intro;

import java.util.Scanner;

public class ArrayExamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Initializing an array of integers
        System.out.print( "Enter the size of the array: ");
        int arr[] = new int[scanner.nextInt()];

        //Taking input from the user to fill the array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the height of Student no " +(i + 1)+ ": ");
            arr[i] = scanner.nextInt();
        }

        //Displaying the heights of the students
        System.out.println("The heights of the students are: ");
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }
}
