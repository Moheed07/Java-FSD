package com.innerClasses;

public class Student {
    int id;
    String name;
    int age;

    //Member inner class
    class Address {
        String address;
        int houseNo;
        String streetName;
        String landmark;
        String city;
        String state;
        int pincode;

        //Setter method for Address
        public void setAddress(String address, int houseNo, String streetName, String landmark, String city, String state, int pincode) {
            this.address = address;
            this.houseNo = houseNo;
            this.streetName = streetName;
            this.landmark = landmark;
            this.city = city;
            this.state = state;
            this.pincode = pincode;
        }
        //Getter method for Address
        public String getAddress() {
            return "Address: " + address + ", House No: " + houseNo + ", Street: " + streetName + ", Landmark: " + landmark + ", City: " + city + ", State: " + state + ", Pincode: " + pincode;
        }
    }

    public Student() {
        id = 0;
        name = "Unknown";
        age = 0;
    }
}