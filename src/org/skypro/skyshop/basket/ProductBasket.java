package org.skypro.skyshop.basket;

import java.util.Arrays;
import org.skypro.skyshop.product.Product;

public class ProductBasket {

    private final Product[] products;
    private int size = 0;

    public ProductBasket(Product[] products) {
        this.products = products;
        size = products.length;
    }

    public ProductBasket(int size) {
        this.products = new Product[size];
    }

    public void addProduct(Product product) {
        if (size == products.length) {
            System.out.println("Корзина переполнена");
        } else {
            products[size++] = product;
        }
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < size; i++) {
            totalPrice += products[i].getPrice();
        }
        return totalPrice;
    }

    public void print(){
        if (size == 0){
            System.out.println("В корзине пусто");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.println(products[i]);
            }
            System.out.println("Специальны товаров: " + specialCount());
            System.out.println("Итого: " + getTotalPrice());
        }
    }

    public int specialCount() {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (products[i].isSpecial()) {
                count++;
            }
        }
        return count;
    }

    public boolean findByName(String name){
        for (int i = 0; i < size; i++) {
            if (products[i].getName().equals(name)){
                return true;
            }
        }
        return false;
    }

    public void clear(){
        size = 0;
        Arrays.fill(products, null);
    }
}
