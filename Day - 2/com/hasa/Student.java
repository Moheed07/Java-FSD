package com.hasa;

public class Student {
    //instance variables
    String name;
    int age;
    int marks;
    //constructor
    public Student(String name, int age, int marks) {
        super();
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    //Handle Composition
    Heart heart = new Heart("Red", 300);
    //Handle Aggregation
    static Book ref;
}
