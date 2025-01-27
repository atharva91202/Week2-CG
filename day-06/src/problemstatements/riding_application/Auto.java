package problemstatements.riding_application;

class Auto extends Vehicle implements GPS {
    private String currentLocation; // Location of the auto

    // Constructor: Set auto details
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm); // Call the parent constructor
        this.currentLocation = "Unknown"; // Initially, the auto location is unknown
    }

    // Implement the calculateFare method to compute the fare for the auto
    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm; // Fare is calculated by multiplying distance with rate per km
    }

    // Implement GPS methods
    @Override
    public String getCurrentLocation() {
        return currentLocation; // Return the current location of the auto
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation; // Update the auto's location to the new value
    }
}
