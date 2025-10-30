package com.hasa;

public class Heart {
    //instance variables
    String color;
    int weight;
    //constructor
    public Heart(String color, int weight) {
        super();
        this.color = color;
        this.weight = weight;
    }
    //method
    void pump() {
        System.out.println("Heart is pumping");
    }
}