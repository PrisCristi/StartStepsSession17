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

}
