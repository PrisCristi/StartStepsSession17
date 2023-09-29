package org.exercise_01;

public class Product {
    private String name;
    private double price;
    private float stock;

    public Product(String s, double v) {
        this.name = s;
        this.price = v;
    }

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
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
    public Product(String name, double price, float stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}