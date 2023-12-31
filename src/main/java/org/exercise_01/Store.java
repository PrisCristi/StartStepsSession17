package org.exercise_01;


import java.util.ArrayList;
import java.util.List;

public class Store {
     List<Product> products = new ArrayList<>();
     List<Order> orders = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOder(List<Order> oder) {
        this.orders = oder;
    }
  

    public void addProduct(Product product){
        this.products.add(product);
        System.out.println(product.getName() + " added to store");
    }

    public void processOrder(Order order){
        this.orders.add(order);
        System.out.println(order.getOrderId() + " order was processed");
    }



}
