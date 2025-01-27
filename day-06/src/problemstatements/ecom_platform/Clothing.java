package problemstatements.ecom_platform;

class Clothing extends Product implements Taxable {
    private double discountAmount;

    public Clothing(int productId, String name, double price, double discountAmount) {
        super(productId, name, price);
        this.discountAmount = discountAmount;
    }

    @Override
    public double calculateDiscount() {
        return discountAmount;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.10; // 10% tax
    }

    @Override
    public String getTaxDetails() {
        return "Tax Rate: 10%";
    }
}
