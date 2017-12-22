package com.lesson1.shop;

public class Catalog {
    private int id;
    private String name;

    public Catalog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Catalog() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String prod_name) {
        this.name = prod_name;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "id=" + id +
                ", prod_name='" + name + '\'' +
                '}';
    }
}