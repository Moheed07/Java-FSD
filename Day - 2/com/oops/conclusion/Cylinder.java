package com.oops.conclusion;

import java.util.Scanner;

final public class Cylinder implements Shape{
    private float radius;
    private float height;
    private float area;

    public Cylinder() {

    }

    public float getRadius() {
        return radius;
    }

    public float getHeight() {
        return height;
    }

    public void setInputs(float radius, float height) {
        this.radius = radius;
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
        System.out.println("Enter the radius of the cylinder:");
        this.radius = scan1.nextFloat();
        System.out.println("Enter the height of the cylinder:");
        this.height = scan1.nextFloat();
    }

    @Override
    public void calculateArea() {
        area = (2 * PI * radius * radius) + (2 * PI * radius * height);
        ;
    }

    @Override
    public void displayArea() {
        System.out.println("The area of the cylinder is: " + area);
    }
}
