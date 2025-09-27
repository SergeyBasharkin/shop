package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public static void main(String[] args) {
        Product milk = new SimpleProduct("Молоко", 50.0);
        Product bread = new DiscountedProduct("Хлеб", 200.0, 20);
        Product eggs = new FixPriceProduct("Яйца");
        Product candies = new SimpleProduct("Конфеты", 400.5);

//        ProductBasket basket = new ProductBasket(new Product[]{milk, bread, eggs});
        ProductBasket basket = new ProductBasket(4);
        basket.print();
        basket.addProduct(milk);
        basket.addProduct(bread);
        basket.addProduct(eggs);

        basket.print();
        System.out.println(basket.getTotalPrice());
//        basket.clear();
        basket.addProduct(candies);
        basket.print();
        System.out.println(basket.findByName("Конфеты"));
    }
}