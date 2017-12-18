package com.lesson1.shop;

public class Catalog {
    private int id;
    private String prod_name;

    public Catalog(int id, String username) {
        this.id = id;
        this.prod_name = prod_name;
    }

    public Catalog() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }
}