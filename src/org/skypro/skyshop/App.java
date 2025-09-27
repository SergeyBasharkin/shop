package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        Product milk = new Product("Молоко", 50.0);
        Product bread = new Product("Хлеб", 20.0);
        Product eggs = new Product("Яйца", 40.5);
        Product candies = new Product("Конфеты", 400.5);

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