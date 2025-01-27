package problemstatements.emp_management;
import java.util.List;
import java.util.ArrayList;
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating a list of employees
        List<Employee> employees = new ArrayList<>();

        // Adding FullTimeEmployee
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee(1, "Alice", 5000, 2000);
        fullTimeEmp.assignDepartment("Engineering");
        employees.add(fullTimeEmp);

        // Adding PartTimeEmployee
        PartTimeEmployee partTimeEmp = new PartTimeEmployee(2, "Bob", 3000, 50, 20);
        partTimeEmp.assignDepartment("Support");
        employees.add(partTimeEmp);

        // Processing and displaying employee details
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("---------------------------");
        }
    }
}

