class Employeedata {
    // Static variable to hold the company name
    static String companyName = "PingWise";

    // Static variable to keep track of the total number of employees
    private static int totalEmployees = 0;

    // Final variable for the employee's ID (unique identifier)
    private final int id;

    // Instance variables for employee's name and designation
    private String name;
    private String designation;

    // Constructor to initialize employee details
    public Employeedata(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;

        // Increment the total employee count whenever a new employee is created
        totalEmployees++;
    }

    // Static method to display the total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total number of employees: " + totalEmployees);
    }

    // Method to display employee details
    public void display() {
        // Check if the current object is an instance of the Employee class
        if (this instanceof Employee) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("This object is not a valid Employee instance.");
        }
    }
}
public class Employee{
    public static void main(String[] args) {
        // Display the company name using the static variable
        System.out.println("Company Name: " + Employeedata.companyName);
        System.out.println();

        // Create employee objects
        Employeedata emp1 = new Employeedata("Travis", 101, "Software Engineer");
        Employeedata emp2 = new Employeedata("Starc", 102, "Project Manager");
        Employeedata emp3 = new Employeedata("Alice", 103, "Quality Analyst");

        // Display details of each employee
        emp1.display();
        System.out.println();
        emp2.display();
	}
}	
