package com.lesson1.shop;

import com.lesson1.lesson21.ConnectorDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO extends AbstractDAO<Integer, Product> {
    public static final String SQL_SELECT_ALL_PRODUCT = "SELECT * FROM product";
    public static final String SQL_SELECT_PRODUCT_ID = "SELECT * FROM product WHERE id=?";

    @Override
    public List<Product> findAll() {
        List<Product> product = new ArrayList<>();
        try (Connection connection = ConnectorDB.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet rs = statement.executeQuery(SQL_SELECT_ALL_PRODUCT);
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String price = rs.getString(3);
                int rate = rs.getInt(4);
                product.add(new Product(id, name, price, rate));
            }
        } catch (SQLException e) {
            System.err.println("SQL Exception (request or table failed):" + e);
        }
        return product;
    }

    @Override
    public Product findEntityById(Integer id) {
        Product product = null;
        try (Connection connection = ConnectorDB.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_SELECT_PRODUCT_ID)) {
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
                String name = rs.getString(2);
                String price = rs.getString(3);
                int rate = rs.getInt(4);
                product = new Product(id, name, price, rate);
            }
        } catch (SQLException e) {
            System.err.println("SQL Exception (request or table failed):" + e);
        }
        return product;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public boolean delete(Product entity) {
        return false;
    }

    @Override
    public boolean create(Product entity) {
        return false;
    }

    @Override
    public Product update(Product entity) {
        return null;
    }
}
