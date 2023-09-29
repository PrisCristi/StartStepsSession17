package org.exercise_01;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer {
    private String name;
    private List<Product> cart = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addToCart(Product item){
        cart.add(item);
        System.out.println(item.getName() + " added to your cart");
    }

    public Order checkout(){
        Order newOrder;
        if(!cart.isEmpty()) {
            newOrder = new Order(System.currentTimeMillis(), cart);
            cart.clear();
        }else {
            newOrder = new Order(System.currentTimeMillis());
        }
        return newOrder;
    }
}
