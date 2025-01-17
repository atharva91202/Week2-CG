import java.util.Scanner;
//Student class definition
class Student{
    String name;
    String rollNumber;
    int marks;

  //Constructor for Student class
    public Student(String name, String rollNumber , int marks){
      this.name=name;
      this.rollNumber = rollNumber;
      this.marks = marks;
  }
  //Method to Calculate grade
  public Character grade(){
      if(marks >= 90){
          return 'A';
      } else if (marks>=75) {
          return 'B';
      } else if (marks >= 50) {
          return 'C';
      }else {
          return 'F';
      }
  }
 //Method to display Student details
  public void display(){
      System.out.println("Student Name : " + name );
      System.out.println("Student RollNumber : " + rollNumber );
      System.out.println("Student Marks : " + marks );
      System.out.println("Student's Grade :" + grade() );
      System.out.println();
  }
}
public class StudentReport {
    public static void main(String[] args) {
        //Creating Scanner object to take user input
       Scanner sc = new Scanner(System.in);

       //Defining size of array to store student data
       Student [] students = new Student[5];

       //Looping to store user input
       for (int i =0;i<5 ; i++) {
           System.out.println("Enter the details for student " + (i + 1) + ":");
           System.out.println("Name");
           String name = sc.nextLine();

           System.out.println("Roll Number");
           String rollnumber = sc.nextLine();

           System.out.println("Marks");
           int marks = sc.nextInt();
           sc.nextLine();

           //Create a new student object and store it in array
           students[i] = new Student(name, rollnumber, marks);
           System.out.println();
       }
       //Display details and grades of each student
        System.out.println("Student Report");
       for (Student student : students){
           student.display();
       }
       sc.close();
    }
}
