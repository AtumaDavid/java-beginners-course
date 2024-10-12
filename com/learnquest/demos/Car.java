package com.learnquest.demos;

// Class declaration
public class Car {

    // These are instance variables (also called attributes or fields).
    // Each Car object will have its own copy of these variables.
    // They are private to ensure encapsulation - direct access from outside the class
    private String make;
    private String model;
    private int year;
    private String color;
    private boolean engineState; // true if running, false if not

    // This is the constructor. It's called when creating a new Car object.
    // It initializes the instance variables with the provided values.
    public Car(String make, String model, int year, String color){
        // 'this' refers to the current instance of the class
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engineState = false; //car is initially not running
    }

    // These are setter methods. They allow controlled modification of the private instance variables.
    // This maintains encapsulation while allowing changes to the object's state.
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngineState(boolean state) {
        this.engineState = state;
    }

    // These are getter methods. They provide controlled access to read the private instance variables.
    // This allows other parts of the program to access the object's state without directly accessing the variables.
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }


    // This is a boolean getter. For boolean variables, it's convention to use "is" instead of "get".
    public boolean isRunning() {
        return engineState;
    }

    // This is an instance method. It operates on the instance's data to perform a specific task.
    // Here, it prints the details of the car using printf for formatted output.
    public void printDetails() {
        System.out.printf("Car: %d %s %s (%s) - Engine %s%n",
                year, make, model, color, (engineState ? "Running" : "Off"));
    }

    // This is the main method. It's the entry point of the program.
    // It demonstrates how to use the Car class by creating and manipulating Car objects.
    public static void main(String[] args) {
        // Create an array of Car objects. Each 'new Car(...)' call creates a new instance of the Car class.
        Car[] cars = {
                new Car("Toyota", "Corolla", 2020, "Silver"),
                new Car("Honda", "Civic", 2019, "Blue"),
                new Car("Ford", "Mustang", 2021, "Red"),
                new Car("Tesla", "Model 3", 2022, "White")
        };

        // Use a for-each loop to iterate through the array of cars and print their details.
        System.out.println("Car Details:");
        for (Car car : cars) {
            car.printDetails();
        }

        // Demonstrate changing a car's state by starting its engine.
        System.out.println("\nStarting the Mustang:");
        cars[2].setEngineState(true);
        cars[2].printDetails();
    }
}
