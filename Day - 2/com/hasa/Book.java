package com.hasa;

public class Book {
    //instance variables
    String name;
    int cost;
    String author;
    //constructor
    public Book(String name, int cost, String author) {
        super();
        this.name = name;
        this.cost = cost;
        this.author = author;
    }
    //method
    void showDetails() {
        System.out.println("Book name: " + name);
        System.out.println("Book cost: " + cost);
        System.out.println("Book author: " + author);
    }
}