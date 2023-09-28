package org.exercise_01;

import java.util.ArrayList;
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
    }

    public void checkout(){
        double orderTotalPrice = 0;
        if(!cart.isEmpty()) {
            for (Product product : cart) {
                orderTotalPrice += product.getPrice();
            }
            System.out.println("Your order total price is " + orderTotalPrice);
            cart.clear();
        }
    }
}
