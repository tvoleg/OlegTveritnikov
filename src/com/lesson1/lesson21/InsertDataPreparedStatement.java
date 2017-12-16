package com.lesson1.lesson21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import static com.lesson1.lesson21.ConnectionData.DRIVER;
import static com.lesson1.lesson21.ConnectionData.URL;
import static com.lesson1.lesson21.ConnectionData.USER;
import static com.lesson1.lesson21.ConnectionData.PASSWORD;

public class InsertDataPreparedStatement {
    private static final String INSERT_QUERY =
            "INSERT INTO rooms (phone_id, room_number) VALUES (?,?);";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName(DRIVER);
        try (Connection connection =
                     DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement =
                     connection.prepareStatement(INSERT_QUERY)) {

            preparedStatement.setInt(1, 6);
            preparedStatement.setInt(2, 522);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 7);
            preparedStatement.setInt(2, 312);
            preparedStatement.addBatch();
            preparedStatement.executeBatch();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}