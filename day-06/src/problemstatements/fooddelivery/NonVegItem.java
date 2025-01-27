package problemstatements.fooddelivery;

// Subclass NonVegItem
class NonVegItem extends FoodItem implements Discountable {
    private double additionalCharge;
    private double discount;

    public NonVegItem(String itemName, double price, int quantity, double additionalCharge) {
        super(itemName, price, quantity);
        this.additionalCharge = additionalCharge;
        this.discount = 0;
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity() + additionalCharge) - discount;
    }

    @Override
    public void applyDiscount(double discountRate) {
        this.discount = (getPrice() * getQuantity() + additionalCharge) * discountRate / 100;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount Applied: " + discount;
    }
}
