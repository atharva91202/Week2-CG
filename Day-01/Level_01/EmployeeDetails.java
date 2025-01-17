//Employee Class Definition
class Employee{
    private String name;
    private  int id ;
    private  int Salary;

    //Constructor to initialise the employee object
    public Employee(String name , int id , int Salary){
        this.name = name;
        this.id = id;
        this.Salary = Salary;
    }
    //Method to display employee details
    public void Display(){
        System.out.println("Employee name " + name);
        System.out.println("Employee id " + id);
        System.out.println("Employee Salary " + Salary);
    }
}
public class EmployeeDetails {
    public static void main(String[] args) {
        //Creating an instance of the Employee class
        Employee employee = new Employee("Alice" ,9,50000);

        //Displaying the details
        employee.Display();
    }
}
