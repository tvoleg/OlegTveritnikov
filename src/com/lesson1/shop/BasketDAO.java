package com.lesson1.shop;

import com.lesson1.lesson21.ConnectorDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BasketDAO extends AbstractDAO<Integer, Basket> {
    public static final String SQL_SELECT_ALL_BASKET_PRODUCT = "SELECT * FROM basket";
    public static final String SQL_SELECT_BASKET_PRODUCT_ID = "SELECT * FROM basket WHERE id=?";

    @Override
    public List<Basket> findAll() {
        List<Basket> basket = new ArrayList<>();
        try (Connection connection = ConnectorDB.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet rs = statement.executeQuery(SQL_SELECT_ALL_BASKET_PRODUCT);
            while (rs.next()) {
                int id = rs.getInt(1);
                int user_id = rs.getInt(2);
                int cat_prod_id = rs.getInt(3);
                int prod_count = rs.getInt(4);
                String date_of_buy = rs.getString(5);
                basket.add(new Basket(id, user_id, cat_prod_id, prod_count, date_of_buy));
            }
        } catch (SQLException e) {
            System.err.println("SQL Exception (request or table failed):" + e);
        }
        return basket;
    }

    @Override
    public Basket findEntityById(Integer id) {
        Basket basket = null;
        try (Connection connection = ConnectorDB.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_SELECT_BASKET_PRODUCT_ID)) {
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
                int user_id = rs.getInt(2);
                int cat_prod_id = rs.getInt(3);
                int prod_count = rs.getInt(4);
                String date_of_buy = rs.getString(5);
                basket = new Basket(id, user_id, cat_prod_id, prod_count, date_of_buy);
            }
        } catch (SQLException e) {
            System.err.println("SQL Exception (request or table failed):" + e);
        }
        return basket;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public boolean delete(Basket entity) {
        return false;
    }

    @Override
    public boolean create(Basket entity) {
        return false;
    }

    @Override
    public Basket update(Basket entity) {
        return null;
    }
}