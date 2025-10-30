package com.datastructures;

final public class Array {
    private int arr[];
    private int size;
    public Array(int size) {
        arr = new int[size];
        this.size = size;
    }

    public void insert(int elem, int index) {
        if (index >= 0 && index <= arr.length - 1) {
            arr[index] = elem;
        } else {
            System.out.println("INDEX OUT OF THE BOUNDARY .... GIVE INDEX BETWEEN 0(ZERO) TO " + (arr.length - 1));
        }
    }

    public void insertAll(int elem) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = elem;
        }
    }

    public void display() {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) System.out.print(" ");
        }
        System.out.println(" ]");
    }

    // Delete a particular index by shifting elements left
    public void delete(int index) {
        if (index >= 0 && index < arr.length) {
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = 0; // Optional: fill the last position with 0 after shift
            System.out.println("Deleted element at index " + index);
        } else {
            System.out.println("INDEX OUT OF THE BOUNDARY .... GIVE INDEX BETWEEN 0(ZERO) TO " + (arr.length - 1));
        }
    }

    // Delete all elements by resetting array values to 0
    public void deleteAll() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        System.out.println("All elements deleted.");
    }
}
