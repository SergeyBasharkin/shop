package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    private final double price;
    private final int sale;

    public DiscountedProduct(String name, double price, int sale) {
        super(name);
        this.price = price;
        this.sale = sale;
    }

    @Override
    public double getPrice() {
        return price - (price * sale / 100);
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public String toString() {
        return getName() + " со скидкой: " + getPrice() + "(" + sale + "%)";
    }
}
