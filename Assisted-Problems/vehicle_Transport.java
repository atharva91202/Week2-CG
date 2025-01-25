class Vehicle{
    int maxSpeed;
    String fuelType;
    public Vehicle(int maxSpeed , String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }
    void displayInfo(){
        System.out.println("The maximum speed of the vehicle is : " + maxSpeed);
        System.out.println("The fuel type used is : "+fuelType );
    }
}
class car extends Vehicle{
    int seatCapacity;
    public car(int maxSpeed,String fuelType,int seatCapacity){
        super(maxSpeed,fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("The Seat capacity of car is : " + seatCapacity);
    }
}
class Truck extends Vehicle{
    int wheelCount;
    public Truck(int maxspeed,String fueltype ,int wheelCount){
        super(maxspeed,fueltype);
        this.wheelCount = wheelCount;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("The number of wheels are " + wheelCount);
    }
}
class motorCycle extends Vehicle{
    String brand;
    public motorCycle(int maxspeed , String fueltype , String brand){
        super(maxspeed,fueltype);
        this.brand = brand;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("The Brand of motorCycle is " + brand);
    }
}
public class vehicle_Transport {
    public static void main(String[] args) {
       Vehicle [] vehicles = new Vehicle[3];
       vehicles[0] = new car(180,"Petrol",7);
       vehicles[1] = new Truck(120,"Diesel",16);
       vehicles[2]= new motorCycle(250,"Ethanol","Kawasaki Ninja HS2");
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println();
        }
    }
}
