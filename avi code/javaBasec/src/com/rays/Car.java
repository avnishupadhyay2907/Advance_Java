package com.rays;

public class Car {
	// Class variable
    static int numberOfCars = 0;

    // Instance variables
    String brand;
    String model;

    // Constructor to initialize instance variables
    public Car(String b, String m) {
        brand = b;
        model = m;
        numberOfCars++; // Incrementing class variable in constructor
    }

    // Method to display car's information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

    public static void main(String[] args) {
        // Creating car objects
        Car car1 = new Car("Toyota", "Camry");
        Car car2 = new Car("Honda", "Accord");

        // Displaying car information
        car1.displayInfo();
        car2.displayInfo();

        // Displaying the number of cars created
        System.out.println("Number of cars created: " + Car.numberOfCars);
    }
}
