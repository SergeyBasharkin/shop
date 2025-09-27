package org.skypro.skyshop.product;

public class FixPriceProduct extends Product{

    private final static double PRICE = 102;

    public FixPriceProduct(String name) {
        super(name);
    }

    @Override
    public double getPrice() {
        return PRICE;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public String toString() {
        return getName() + " с фиксированной ценой: Фиксированная цена " + getPrice();
    }
}
