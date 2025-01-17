//Mobile Phones class Definition
class MobilePhones{
    String brand ;
    String Model;
    int price;
    //Constructor for the  class
    public MobilePhones(String brand,String Model,int price){
        this.brand = brand;
        this.Model = Model;
        this.price = price;
    }
    //Displaying Results
    public void display(){
        System.out.println("Details of the phone are as");
        System.out.println("Brand of Phone is : " + brand );
        System.out.println("Model of Phone is : " + Model);
        System.out.println("Price of the Phone is : " + price);
    }
}
public class Mobiles {
    public static void main(String[] args) {
        //Creating instance of the MobilePhones class
       MobilePhones phone1 = new MobilePhones("Motorola" , "Edge 50 Neo",20000);
       MobilePhones phone2 = new MobilePhones("Vivo","V4000e",23000);
       //Displaying results
       phone1.display();
       phone2.display();
    }
}
