package com.simplilearn.JDBC.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static Connection connection;

    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {

                Class.forName("com.mysql.cj.jdbc.Driver");

                String url = "jdbc:mysql://localhost:3306/mydb?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
                String user = "root";
                String password = "Balaji@123";

                connection = DriverManager.getConnection(url, user, password);
                System.out.println("✔ DB Connected");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}