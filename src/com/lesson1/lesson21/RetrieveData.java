package com.lesson1.lesson21;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import static com.lesson1.lesson21.ConnectionData.DRIVER;
import static com.lesson1.lesson21.ConnectionData.URL;
import static com.lesson1.lesson21.ConnectionData.USER;
import static com.lesson1.lesson21.ConnectionData.PASSWORD;

public class RetrieveData {
    private static final String SELECT_QUERY = "SELECT * FROM phones;";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName(DRIVER);
        try (Connection connection =
                     DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery(SELECT_QUERY);
            System.out.printf("%-20s%s%n", "id", "user_id", "phone_number");
            System.out.println("-------------------------------");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int user = resultSet.getInt("user_id");
                String number = resultSet.getString("phone_number");
                System.out.printf("%-20d%-20s%n", id, user, number);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}