package com.lesson1.shop;

public class CatalogProduct {
    private int id, catalog_id, product_id;

    public CatalogProduct(int id, int catalog_id, int product_id) {
        this.id = id;
        this.catalog_id = catalog_id;
        this.product_id = product_id;
    }

    public CatalogProduct() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCatalog_id() {
        return catalog_id;
    }

    public void setCatalog_id(int catalog_id) {
        this.catalog_id = catalog_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    @Override
    public String toString() {
        return "CatalogProduct{" +
                "id=" + id +
                ", catalog_id=" + catalog_id +
                ", product_id=" + product_id +
                '}';
    }
}
