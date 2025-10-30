package com.interfaces;

public class Demo10 extends Sample8 implements Sample9 {
    @Override
    public void add() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("Addition: " + c);
    }
}
