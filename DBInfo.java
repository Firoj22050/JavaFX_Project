package com.example.my_favourite_dish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBInfo {
    private static final String URL = "jdbc:mysql://localhost:3306/food_db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    private static final String USER = "Firoj";
    private static final String PASSWORD = "2345";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
