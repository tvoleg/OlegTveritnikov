package com.lesson1.shop;

public class Basket {
    private int id, user_id,cat_prod_id,prod_count;
    private String date_of_buy;

    public Basket(int id, int user_id, int cat_prod_id, int prod_count, String date_of_buy) {
        this.id = id;
        this.user_id = user_id;
        this.cat_prod_id = cat_prod_id;
        this.prod_count = prod_count;
        this.date_of_buy = date_of_buy;
    }

    public Basket() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getCat_prod_id() {
        return cat_prod_id;
    }

    public void setCat_prod_id(int cat_prod_id) {
        this.cat_prod_id = cat_prod_id;
    }

    public int getProd_count() {
        return prod_count;
    }

    public void setProd_count(int prod_count) {
        this.prod_count = prod_count;
    }

    public String getDate_of_buy() {
        return date_of_buy;
    }

    public void setDate_of_buy(String date_of_buy) {
        this.date_of_buy = date_of_buy;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", cat_prod_id=" + cat_prod_id +
                ", prod_count=" + prod_count +
                ", date_of_buy='" + date_of_buy + '\'' +
                '}';
    }
}
