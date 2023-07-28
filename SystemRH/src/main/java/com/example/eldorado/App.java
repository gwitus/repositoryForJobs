package com.example.eldorado;

// Imports
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.io.Console;

public class App {
    // Variáveis globais
    static Date dataAgora = new Date();
    static ConexaoMySQL conexaoDatabase = new ConexaoMySQL();

    // ----Função main para executar---\\
    public static void main( String[] args) throws ParseException
    {
         // ----------------++ Objetos ++ -------------------- \\
        Pessoa firstPerson = new Pessoa();
        Scanner scan = new Scanner(System.in);
        // Objeto para validar a senha digitada, dai o que for digitado no console na hora da senha após inserir o comando vai deixar oculto sem que ninguém em volta possar ler
        Console console = System.console();


        // ----------------++ Variáveis ++ -------------------- \\
        // Formatador de horário
        SimpleDateFormat formatoDiaMes  = new SimpleDateFormat("dd/MM/yyyy", new Locale("pt", "BR"));
        SimpleDateFormat formatoHorario = new SimpleDateFormat("HH:mm", new Locale("pt", "BR"));
        String diaMesFormatado          = formatoDiaMes.format(dataAgora);
        String horarioFormatado         = formatoHorario.format(dataAgora);

        // ----------------++ Código ++ -------------------- \\
        conexaoDatabase.testeConexao();
        System.out.println("Bem vindo, hoje é dia " + diaMesFormatado + " e agora são: " + horarioFormatado + "!\nRealize seu login :) ");
        // Comandos para colher usuário
        String user     = console.readLine("Insira seu Usuário: ");
        char[] password = console.readPassword("Digite sua senha: ");
    }
}