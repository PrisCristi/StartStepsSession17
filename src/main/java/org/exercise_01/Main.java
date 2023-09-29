package org.exercise_01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Product 1 ", 55.98 );
        Product product2 = new Product("Product 2 ", 89.03 );

        Customer customer = new Customer();
        customer.setName("Natallia");

        customer.addToCart(product1);
        customer.addToCart(product2);

        Order order1 = customer.checkout();
        order1.generateInvoice();

        Store store1 = new Store();
        store1.addProduct(product1);
        store1.addProduct(product2);
        store1.processOrder(order1);
    }

}
