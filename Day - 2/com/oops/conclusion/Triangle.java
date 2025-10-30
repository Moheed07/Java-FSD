package com.oops.conclusion;

import java.util.Scanner;

final public class Triangle implements Shape {
    private float base;
    private float height;
    private float area;

    public Triangle() {

    }

    public float getBase() {
        return base;
    }

    public float getHeight() {
        return height;
    }

    public void setInputs(float base, float height) {
        this.base = base;
        this.height = height;
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
        System.out.println("Enter the base of the triangle:");
        this.base = scan1.nextFloat();
        System.out.println("Enter the height of the triangle:");
        this.height = scan1.nextFloat();
    }

    @Override
    public void calculateArea() {
        area = 1/2 * base * height;;
    }

    @Override
    public void displayArea() {
        System.out.println("The area of the triangle is: " + area);
    }
}
