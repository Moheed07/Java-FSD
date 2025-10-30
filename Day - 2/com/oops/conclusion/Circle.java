package com.oops.conclusion;

import java.util.Scanner;

final public class Circle implements Shape {
    private float radius;
    private float area;
    public Circle() {

    }
    public float getRadius() {
        return radius;
    }
    public void setRadius(float radius) {
        this.radius = radius;
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
        System.out.println("Enter the radius of the circle:");
        this.radius = scan1.nextFloat();
    }
    @Override
    public void calculateArea() {
        area = PI * radius * radius;
    }
    @Override
    public void displayArea() {
        System.out.println("The area of the circle is: " + area);
    }
}
