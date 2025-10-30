package com.datastructures;

public class Main {
    public static void main(String[] args) {
        Array arr = new Array(5);
        arr.insertAll(10);
        arr.display(); // [ 10 10 10 10 10 ]
        arr.insert(20, 2);
        arr.display(); // [ 10 10 20 10 10 ]
        arr.delete(2);
        arr.display(); // [ 10 10 10 10 0 ]
        arr.deleteAll();
        arr.display(); // [ 0 0 0 0 0 ]
    }
    
}
