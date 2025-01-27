package problemstatements.ecom_platform;
import java.util.ArrayList;
import java.util.List;
// Main class
public class ECommercePlatform {
    public static void main(String[] args) {
        // Creating a list of products
        List<Product> products = new ArrayList<>();

        // Adding Electronics product
        Electronics laptop = new Electronics(1, "Laptop", 1000, 0.1);
        products.add(laptop);

        // Adding Clothing product
        Clothing shirt = new Clothing(2, "Shirt", 50, 5);
        products.add(shirt);

        // Adding Groceries product
        Groceries apples = new Groceries(3, "Apples", 20, 0.05);
        products.add(apples);

        // Calculating and displaying final prices
        for (Product product : products) {
            double discount = product.calculateDiscount();
            double tax = product instanceof Taxable ? ((Taxable) product).calculateTax() : 0;
            double finalPrice = product.getPrice() + tax - discount;

            System.out.println("Product: " + product.getName());
            System.out.println("Base Price: " + product.getPrice());
            System.out.println("Discount: " + discount);
            System.out.println((product instanceof Taxable) ? ((Taxable) product).getTaxDetails() : "No Tax Applicable");
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("---------------------------");
        }
    }
}
