package com.lesson1.lesson21;
  /*
import com.lesson1.shop.AbstractDAO;
import com.lesson1.shop.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PhonesDAO extends AbstractDAO<Integer,Phone> {
    public static final String SQL_SELECT_ALL_USERS = "SELECT * FROM phones";
    public static final String SQL_SELECT_USER_ID = "SELECT * FROM phones WHERE user_id=?";

   @Override
    public List<Phone> findAll() {
        List<Phone> phones = new ArrayList<>();
        try (Connection connection = ConnectorDB.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet rs = statement.executeQuery(SQL_SELECT_ALL_USERS);
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                phones.add(new Phone(id, name));
            }
        } catch (SQLException e) {
            System.err.println("SQL Exception (request or table failed):" + e);
        }
        return phones;
    }

    @Override
    public Phone findEntityById(Integer id) {
        Phone phones = null;
        try (Connection connection = ConnectorDB.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_SELECT_USER_ID)) {
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
                String name = rs.getString(2);
                user = new User(id, name);
            }
        } catch (SQLException e) {
            System.err.println("SQL Exception (request or table failed):" + e);
        }
        return phones;
    }

    @Override
    public boolean delete(Integer id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean delete(Phone entity) {
        return false;
    }

    @Override
    public boolean create(Phone entity) {
        return false;
    }

    @Override
    public Phone update(Phone entity) {
        return null;
    }
}*/
