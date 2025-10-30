package com.oops.conclusion;

import java.util.Scanner;

final public class Rectangle implements Shape {
    private float length;
    private float width;
    private float area;

    public Rectangle() {

    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public void setInputs(float length, float width) {
        this.length = length;
        this.width = width;
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
        System.out.println("Enter the length of the rectangle:");
        this.length = scan1.nextFloat();
        System.out.println("Enter the width of the rectangle:");
        this.width = scan1.nextFloat();
    }

    @Override
    public void calculateArea() {
        area = length * width;;
    }

    @Override
    public void displayArea() {
        System.out.println("The area of the rectangle is: " + area);
    }
}
