package com.lesson1.lesson21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import static com.lesson1.lesson21.ConnectionData.*;

public class CreatingTable {
    private final static String CREATE_TABLE_QUERY =
            "CREATE TABLE `rooms` (" +
                    "`id` INT(5) NOT NULL AUTO_INCREMENT," +
                    "`phone_id` INT(5) NULL DEFAULT NULL," +
                    "`room_number` INT(4) NULL DEFAULT NULL," +
                    "PRIMARY KEY (`id`));";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName(DRIVER);
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(CREATE_TABLE_QUERY);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}