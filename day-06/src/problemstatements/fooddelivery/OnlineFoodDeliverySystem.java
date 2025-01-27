package problemstatements.fooddelivery;
import java.util.List;
import java.util.ArrayList;
// Main class
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        // Creating a list of food items
        List<FoodItem> order = new ArrayList<>();

        // Adding VegItem
        VegItem vegItem = new VegItem("Paneer Butter Masala", 200, 2);
        vegItem.applyDiscount(10);
        order.add(vegItem);

        // Adding NonVegItem
        NonVegItem nonVegItem = new NonVegItem("Chicken Biryani", 300, 1, 50);
        nonVegItem.applyDiscount(5);
        order.add(nonVegItem);

        // Processing and displaying order details
        for (FoodItem item : order) {
            System.out.println(item.getItemDetails());
            System.out.println("Total Price: " + item.calculateTotalPrice());

            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                System.out.println(discountable.getDiscountDetails());
            }

            System.out.println("---------------------------");
        }
    }
}
