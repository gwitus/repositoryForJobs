package com.example.eldorado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {
    private static final String URL     = "jdbc:mysql://localhost:3306/sistemaRH";
    private static final String USUARIO = "gwitus";
    private static final String SENHA   = "2204Silv@123_";

    //Banco conexão, agora aprender sobre mysql
    public static Connection obterConexao() {
        try {
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
