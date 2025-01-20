public class Product{
  // Static variable to hold the discount shared by all products
    static double discount = 10.0; // Default discount in percentage

    // Final variable for the product ID (unique identifier)
    private final int productID;

    // Instance variables for product name, price, and quantity
     String productName;
     double price;
     int quantity;

    // Constructor to initialize the product's details
    public Product(int productID, String productName, double price, int quantity) {
        // Use 'this' to resolve ambiguity and initialize instance variables
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update the discount percentage
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to " + discount + "% for all products.");
    }

    // Method to calculate the total price after applying the discount
    public double calculateDiscountedPrice() {
        double discountedPrice = price * (1 - discount / 100);
        return discountedPrice * quantity;
    }

    // Method to display product details
    public void displayProductDetails() {
        // Check if the current object is an instance of the Product class
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price per Unit: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discounted Total Price: $" + calculateDiscountedPrice());
        } else {
            System.out.println("This object is not a valid Product instance.");
        }
    }
	  // Display the default discount
        System.out.println("Default Discount: " + Product.discount + "%\n");

        // Create product objects
        Product product1 = new Product(1, "Laptop", 800.0, 2);
        Product product2 = new Product(2, "Smartphone", 500.0, 1);
        Product product3 = new Product(3, "Headphones", 50.0, 3);

        // Display details of each product
        product1.displayProductDetails();
        System.out.println();
        product2.displayProductDetails();
        System.out.println();
        product3.displayProductDetails();

        System.out.println();

        // Update the discount using the static method
        Product.updateDiscount(15.0);

        System.out.println();

        // Display details again after updating the discount
        product1.displayProductDetails();
        System.out.println();
        product2.displayProductDetails();
        System.out.println();
        product3.displayProductDetails();

        System.out.println();

        // Check instanceof operator on a valid object
        if (product1 instanceof Product) {
            System.out.println("product1 is an instance of the Product class.");
        }

        // Attempt to check instanceof on a null reference
        Product product4 = null;
        if (product4 instanceof Product) {
            System.out.println("product4 is an instance of the Product class.");
        } else {
            System.out.println("product4 is not a valid instance.");
        }
    }
}