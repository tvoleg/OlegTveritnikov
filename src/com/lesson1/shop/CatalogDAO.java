package com.lesson1.shop;

import com.lesson1.lesson21.ConnectorDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CatalogDAO extends AbstractDAO<Integer, Catalog> {
    public static final String SQL_SELECT_ALL_CATALOG_USERS = "SELECT * FROM catalog";
    public static final String SQL_SELECT_CATALOG_ID = "SELECT * FROM catalog WHERE id=?";

    @Override
    public List<Catalog> findAll() {
        List<Catalog> catalog = new ArrayList<>();
        try (Connection connection = ConnectorDB.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet rs = statement.executeQuery(SQL_SELECT_ALL_CATALOG_USERS);
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                catalog.add(new Catalog(id, name));
            }
        } catch (SQLException e) {
            System.err.println("SQL Exception (request or table failed):" + e);
        }
        return catalog;
    }

    @Override
    public Catalog findEntityById(Integer id) {
        Catalog catalog = null;
        try (Connection connection = ConnectorDB.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_SELECT_CATALOG_ID)) {
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
                String name = rs.getString(2);
                catalog = new Catalog(id, name);
            }
        } catch (SQLException e) {
            System.err.println("SQL Exception (request or table failed):" + e);
        }
        return catalog;
    }

    @Override
    public boolean delete(Integer id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean delete(Catalog entity) {
        return false;
    }

    @Override
    public boolean create(Catalog entity) {
        return false;
    }

    @Override
    public Catalog update(Catalog entity) {
        return null;
    }
}
