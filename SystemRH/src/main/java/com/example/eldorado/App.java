package com.example.eldorado;
// Imports
import java.text.ParseException;
import java.util.Date;

public class App {
    // Variáveis globais
    static Date dataAgora = new Date();
    static ConexaoMySQL conexaoDatabase = new ConexaoMySQL();

    // ----Função main para executar---\\
    public static void main( String[] args) throws ParseException
    {
        // ----------------++ Objetos ++ -------------------- \\
        Pessoa firstPerson = new Pessoa();
        firstPerson.cadastrarCandidato();
    }
}