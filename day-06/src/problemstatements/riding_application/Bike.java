package problemstatements.riding_application;

class Bike extends Vehicle implements GPS {
    private String currentLocation; // Location of the bike

    // Constructor: Set bike details
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm); // Call the parent constructor
        this.currentLocation = "Unknown"; // Initially, the bike location is unknown
    }

    // Implement the calculateFare method to compute the fare for the bike
    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm; // Fare is calculated by multiplying distance with rate per km
    }

    // Implement GPS methods
    @Override
    public String getCurrentLocation() {
        return currentLocation; // Return the current location of the bike
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation; // Update the bike's location to the new value
    }
}
