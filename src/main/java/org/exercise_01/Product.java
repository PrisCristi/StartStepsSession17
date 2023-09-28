package org.exercise_01;

public class Product {
    private String name;
    private int price;
    private float stock;

    public void getDetails() {
        System.out.println("Name = " + name);
        System.out.println("Price = " + price);
        System.out.println("stock = " + stock);

    }

    public void updateStock() {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public float getStock() {
        return stock;
    }

    public void setStock(float stock) {
        this.stock = stock;
    }

    public Product(){

    }
    public Product(String name, int price, float stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}