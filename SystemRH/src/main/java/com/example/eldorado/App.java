package com.example.eldorado;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;

public class App {
    // ----------------------++Função main para executar+++------------------------------\\
    public static void main( String[] args) throws ParseException
    {
        ConexaoMySQL conexaoDatabase = new ConexaoMySQL();
        Pessoa firstPerson           = new Pessoa();
        // Passo 1 - Teste de conexão;
        conexaoDatabase.testeConexao();
        // Padrão para adionar pessoa
        
        // firstPerson.adicionarPessoa("Vinícius", "12345678900", "2003/04/22", "13053", false, false, false, false);
        firstPerson.deletarPessoa("candidatos", 1);
        firstPerson.deletarPessoa("candidatos", 2);
        firstPerson.deletarPessoa("candidatos", 3);
    }
}