//Area class definition
 class Area{
    double radius;
    //Constructor initialisation for the Area object
    public Area(double radius){
        this.radius = radius;
    }
    //Method to Calculate Area
    public double CalcArea(){
        return Math.PI*radius*radius;
    }
    //Method to display the Radius and Area
    public void display(){
        System.out.println("Radius : " + radius);
        System.out.println("Area : " + CalcArea());
    }
}
public class AreaofCircle {
    public static void main(String[] args) {
        //Creating object for Area class
        Area area = new Area(7.29);

        //Displaying the area
        area.display();
    }
}
