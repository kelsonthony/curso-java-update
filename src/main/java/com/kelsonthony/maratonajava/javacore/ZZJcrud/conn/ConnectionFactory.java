package com.kelsonthony.maratonajava.javacore.ZZJcrud.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/anime_store";
        String username = "root";
        String password = "password";

        return DriverManager.getConnection(url, username, password);

    }
}
