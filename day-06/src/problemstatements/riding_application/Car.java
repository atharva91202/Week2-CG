package problemstatements.riding_application;

class Car extends Vehicle implements GPS {
    private String currentLocation; // Location of the car

    // Constructor: Set car details
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm); // Call the parent constructor
        this.currentLocation = "Unknown"; // Initially, the car location is unknown
    }

    // Implement the calculateFare method to compute the fare for the car
    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm; // Fare is calculated by multiplying distance with rate per km
    }

    // Implement GPS methods
    @Override
    public String getCurrentLocation() {
        return currentLocation; // Return the current location of the car
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation; // Update the car's location to the new value
    }
}

