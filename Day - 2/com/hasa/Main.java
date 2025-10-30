package com.hasa;

public class Main {
    public static void main(String[] args) {
        //Creating Student Object
        Student student = new Student("Moheed", 21, 90);

        System.out.println("Student Details: " + student.name + ", " + student.age + ", " + student.marks);

        System.out.println("Heart Details: " + student.heart.color + ", " + student.heart.weight);

        //Calling method using object reference
        student.heart.pump();

        //Creating Book Object
        Book book = new Book("Concepts of Physics", 1200, "H.C Verma");
        //Aggregation
        Student.ref = book;

        System.out.println("Book Details: " + Student.ref.name + ", " + Student.ref.cost + ", " + Student.ref.author);
        
        //Calling method using class reference
        Student.ref.showDetails();

    }
}
