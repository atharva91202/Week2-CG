package problemstatements.vehicleRental;
import java.util.List;
import java.util.ArrayList;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        // Creating a list of vehicles
        List<Vehicle> vehicles = new ArrayList<>();

        // Adding vehicles
        vehicles.add(new Car("C123", 50, "CAR123INS"));
        vehicles.add(new Bike("B456", 20));
        vehicles.add(new Truck("T789", 100, "TRK789INS"));

        // Processing and displaying details
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Rental Cost for 5 days: " + vehicle.calculateRentalCost(5));

            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println(insurable.getInsuranceDetails());
                System.out.println("Insurance Cost: " + insurable.calculateInsurance());
            } else {
                System.out.println("No insurance available for this vehicle.");
            }

            System.out.println("---------------------------");
        }
    }
}
