package problemstatements.riding_application;

abstract class Vehicle {
    protected String vehicleId; // Unique ID for the vehicle
    protected String driverName; // Name of the driver
    protected double ratePerKm; // Cost per kilometer for this vehicle

    // Constructor
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    // Concrete method to return details about the vehicle
    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate per Km: " + ratePerKm;
    }
}