//Item Class Defination
class Item{
    int item_code;
    String item_name;
    int price;

   //Initialising constructor for Item Object
    public Item(int item_code,String item_name,int price){
        this.item_code =item_code;
        this.item_name = item_name;
        this.price = price;
    }
    //Creating method to calculate cost
    public int Cost(int quantity){
        return price*quantity;
    }
    //Creating method to display
    public void display(){
        System.out.println("The item details are as :");
        System.out.println("Item Code is " + item_code);
        System.out.println("Item name is :" + item_name);
        System.out.println("Price is: " + price );
    }

}
public class trackItem {
    public static void main(String[] args) {
        //Creating instance of Item class
         Item first_item = new Item(1007,"Asus Vivobook", 42000);
        //Displaying the Details
         first_item.display();

         //Calculating final cost and displaying it
         int quantity = 25;
         int totalcost = first_item.Cost(quantity);
        System.out.println("Final Cost is " + totalcost);
    }
}
