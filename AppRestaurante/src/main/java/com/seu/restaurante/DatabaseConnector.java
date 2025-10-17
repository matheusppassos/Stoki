package com.seu.restaurante;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    private static final String URL = "jdbc:mysql://localhost:3306/restaurante_db?serverTimezone=UTC";
    // Utilizador padrão do XAMPP
    private static final String USER = "root";
    // Senha padrão do XAMPP (vazia)
    private static final String PASSWORD = "";

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Erro ao conectar à base de dados MySQL: " + e.getMessage());
        }
        return conn;
    }
}