package com.oops.conclusion;

import java.util.Scanner;

final public class Square implements Shape {
    private float side;
    private float area;

    public Square() {

    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    @Override
    public void acceptInput() {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the side of the square:");
        side = scan1.nextFloat();
    }

    @Override
    public void calculateArea() {
        area = side * side;
    }

    @Override
    public void displayArea() {
        System.out.println("The area of the square is: " + area);
    }
}