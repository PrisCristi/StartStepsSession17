package org.exercise_01;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private long orderId;
    private List<Product> products = new ArrayList<>();

    private double totalPrice;

    public Order(long orderId, List<Product> products) {
        this.orderId = orderId;
        this.products = products;
        double totalPrice = 0;
        for (Product product: products){
            totalPrice+=product.getPrice();
        }
        this.totalPrice = totalPrice;
    }

    public Order(long orderId) {
        this.orderId = orderId;
        this.totalPrice = 0;
    }

    public void generateInvoice(){
        System.out.println("Order id: " + orderId);
        System.out.println("Order products: ");
        for (Product product: products){
            System.out.println(product.getName() + "    " + product.getPrice());
        }
        System.out.println("Total price: " + totalPrice);
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
