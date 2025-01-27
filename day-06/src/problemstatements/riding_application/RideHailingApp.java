package problemstatements.riding_application;

public class RideHailingApp {
    public static void main(String[] args) {
        // Create instances of different vehicles (Car, Bike, Auto)
        Vehicle car = new Car("C001", "John", 10.0); // Rate per km for the car: 10
        Vehicle bike = new Bike("B001", "Alice", 5.0); // Rate per km for the bike: 5
        Vehicle auto = new Auto("A001", "Bob", 8.0); // Rate per km for the auto: 8

        // Print details about each vehicle
        System.out.println(car.getVehicleDetails());
        System.out.println(bike.getVehicleDetails());
        System.out.println(auto.getVehicleDetails());

        // Calculate and display fares for a 10 km ride for each vehicle
        System.out.println("\nFare for a 10 km ride:");
        System.out.println("Car Fare: " + car.calculateFare(10)); // Fare for car
        System.out.println("Bike Fare: " + bike.calculateFare(10)); // Fare for bike
        System.out.println("Auto Fare: " + auto.calculateFare(10)); // Fare for auto

        // Update the locations of the vehicles
        ((GPS) car).updateLocation("Downtown"); // Update car's location
        ((GPS) bike).updateLocation("Uptown"); // Update bike's location
        ((GPS) auto).updateLocation("Suburb"); // Update auto's location

        // Display updated locations
        System.out.println("\nUpdated Locations:");
        System.out.println("Car Location: " + ((GPS) car).getCurrentLocation()); // Display car location
        System.out.println("Bike Location: " + ((GPS) bike).getCurrentLocation()); // Display bike location
        System.out.println("Auto Location: " + ((GPS) auto).getCurrentLocation()); // Display auto location
    }
}
