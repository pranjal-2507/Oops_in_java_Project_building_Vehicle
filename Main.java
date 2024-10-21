
import java.util.*;

abstract class Vehicle {
    private String make;
    private String model;
    private int year;

    // Constructor
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Abstract method (to be implemented by subclasses)
    public abstract void displayInfo();

    // Getter for 'make'
    public String getMake() {
        return make;
    }

    // Setter for 'make'
    public void setMake(String make) {
        this.make = make;
    }

    // Getter for 'model'
    public String getModel() {
        return model;
    }

    // Setter for 'model'
    public void setModel(String model) {
        this.model = model;
    }

    // Getter for 'year'
    public int getYear() {
        return year;
    }

    // Setter for 'year'
    public void setYear(int year) {
        this.year = year;
    }
}

// Subclass Car that extends Vehicle
class Car extends Vehicle {
    private int doors;

    // Constructor
    public Car(String make, String model, int year, int doors) {
        super(make, model, year); // Calling parent class constructor
        this.doors = doors;
    }

    // Implementing the abstract method
    @Override
    public void displayInfo() {
        System.out.println("Car: " + getYear() + " " + getMake() + " " + getModel() + ", Doors: " + doors);
    }

    // Getter for 'doors'
    public int getDoors() {
        return doors;
    }

    // Setter for 'doors'
    public void setDoors(int doors) {
        this.doors = doors;
    }
}

// Subclass Motorcycle that extends Vehicle
class Motorcycle extends Vehicle {
    private String type;

    // Constructor
    public Motorcycle(String make, String model, int year, String type) {
        super(make, model, year); // Calling parent class constructor
        this.type = type;
    }

    // Implementing the abstract method
    @Override
    public void displayInfo() {
        System.out.println("Motorcycle: " + getYear() + " " + getMake() + " " + getModel() + ", Type: " + type);
    }

    // Getter for 'type'
    public String getType() {
        return type;
    }

    // Setter for 'type'
    public void setType(String type) {
        this.type = type;
    }
}

// Main class to demonstrate the functionality
public class Main {
    public static void main(String[] args) {
        // Creating instances of Car and Motorcycle
        Car car1 = new Car("Toyota", "Corolla", 2020, 4);
        Motorcycle moto1 = new Motorcycle("Yamaha", "MT-07", 2019, "Sport");

        // Displaying initial information
        car1.displayInfo();
        moto1.displayInfo();

        // Changing the values using setter methods
        car1.setMake("Honda");
        car1.setDoors(2);

        moto1.setModel("MT-09");
        moto1.setType("Touring");

        // Displaying updated information
        car1.displayInfo();
        moto1.displayInfo();
    }
}
