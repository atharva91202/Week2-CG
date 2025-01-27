package problemstatements.riding_application;


interface GPS {
    String getCurrentLocation(); // Method to get the current location of the vehicle
    void updateLocation(String newLocation); // Method to update the vehicle's location
}
