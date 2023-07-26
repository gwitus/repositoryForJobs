package com.example.eldorado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
// Tinha faltando o Statement
import java.sql.Statement;

public class ConexaoMySQL {
    private static final String URL     = "jdbc:mysql://localhost:3306/sistemaRH";
    private static final String USUARIO = "gwitus";
    private static final String SENHA   = "2204Silv@123_";

    //Banco conexão, agora aprender sobre mysql
    public static Connection obterConexao() {
        //Erros daqui vão ser relacionados ao login ou erros do driver de conexão
        try {
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    // Teste unitário da conexão
    public void testeConexao() {
        try {
            Connection conexao = ConexaoMySQL.obterConexao();
            if (conexao != null) {
                System.out.println("Conexão ok!");
            } else {
                System.out.println("Erro ao estabelecer link de conexão.");
            }
        } catch (Exception e) {
            System.out.println("Erro:" + e);
        }
        
    }

     // Método para adicionar uma pessoa no banco de dados
     public static void adicionarPessoa(String nome, String cpf, String dataNascimento, String conta,
     boolean comprovanteEm, boolean comprovanteFacul,
     boolean mba, boolean cnh) {

    try (Connection conexao = obterConexao()) {
    String sql = "INSERT INTO Candidatos (nome, cpf, data_nasc, conta, comprovante_em, comprovante_facul, mba, cnh) " +
    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
        // Substitui os placeholders na instrução SQL pelos valores fornecidos
        pstmt.setString(1, nome);
        pstmt.setString(2, cpf);
        pstmt.setString(3, dataNascimento);
        pstmt.setString(4, conta);
        pstmt.setBoolean(5, comprovanteEm);
        pstmt.setBoolean(6, comprovanteFacul);
        pstmt.setBoolean(7, mba);
        pstmt.setBoolean(8, cnh);

        // Executa a instrução SQL de inserção
        pstmt.executeUpdate();
        System.out.println("Pessoa adicionada com sucesso!");
        }
        
        } catch (SQLException e) {
        System.err.println("Erro ao adicionar pessoa no banco de dados: " + e.getMessage());
        e.printStackTrace();
        }
    }
}