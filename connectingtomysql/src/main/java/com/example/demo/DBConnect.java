package com.example.demo;

import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;

@Service
public class DBConnect {

    public  Connection getConnection() {

        try {
            String url = "jdbc:mysql://localhost:3306/test_db";
            Connection conn = DriverManager.getConnection(url, "root", "root");
            return conn;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            // conn.close();
        }
    }
}
