public class Car {
    // Variables to store car data
    private String make;
    private String model;
    private int year;
    private double mpg;
    private static int carId = 1;
    
    // Constructor for default car
    public Car() {
        this.make = "None";
        this.model = "None";
        this.year = 2000;
        this.mpg = 0.0;
        this.carId = carId++;
    }
    
    // Constructor for custom car
    public Car(String make, String model, int year, double mpg) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mpg = mpg;
        this.carId = carId++;
        
        // Check if year is valid
        if (year > 2022) {
            this.year = 2022;
        } else if (year < 1885) {
            this.year = 2000;
        }
        
        // Check if mpg is valid
        if (mpg < 0) {
            this.mpg = 0;
        }
    }
    
    // toString method to return car information
    public String toString() {
        return "ID: " + carId + "\nMake: " + make + "\nModel: " + model + "\nYear: " + year + "\nMPG: " + mpg;
    }
}
