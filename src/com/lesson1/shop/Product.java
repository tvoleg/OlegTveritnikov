package com.lesson1.shop;

public class Product {
    private int id,  rate;
    private String name, price;

    public Product(int id, String name, String price,int rate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rate = rate;
    }
    public Product(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", rate=" + rate +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
