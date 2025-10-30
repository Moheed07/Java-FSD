package com.interfaces;

public class Main {
    public static void main(String[] args) {
        Calculator casioCalculator = new CasioCalculator();
        Calculator epsonCalculator = new EpsonCalculator();
        System.out.println("Using Casio Calculator:");
        Math.calculate(casioCalculator);
        System.out.println("\nUsing Epson Calculator:");
        Math.calculate(epsonCalculator);
    }
}
