class Employee{
    String name;
    int id;
    Double Salary;
    public Employee(String name , int id , Double Salary){
        this.name=name;
        this.id=id;
        this.Salary=Salary;
    }
    void displayDetails(){
        System.out.println("Name of the Employee : " + name);
        System.out.println("Employee id is : "+ id);
        System.out.println("Salary of the Employee is : " + Salary);
    }
}
class Manager extends Employee{
    int teamSize;
    public Manager(String name,int id , double Salary,int teamSize){
        super(name,id,Salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("The Size of team is " + teamSize);
    }
}
class Developer extends Employee{
    String programmingLanguage;
    public Developer(String name , int id , double Salary , String programmingLanguage){
        super(name,id,Salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming language of the developer is : " + programmingLanguage);
    }
}
class Intern extends Employee{
    String inter_Dept;
    public Intern(String name, int id , double Salary , String intern_Dept){
        super(name,id,Salary);
        this.inter_Dept = intern_Dept;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("The interning department is " + inter_Dept);
    }
}

public class Emp_Management {
    public static void main(String[] args) {
         Employee e1 = new Manager("Angad",10078,290038,20);
         Employee e2 = new Developer("Raghu",10036,100000,"Java");
         Employee e3 = new Intern("Shlok",1013,8000,"Research and Development");
         e1.displayDetails();
        System.out.println();
        e2.displayDetails();
        System.out.println();
        e3.displayDetails();

    }
}
