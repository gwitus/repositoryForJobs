package com.example.eldorado;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;

public class App {

    public static void main( String[] args) throws ParseException
    {
        // Ainda fico por decidir se vai ser tudo feito na mão ou se vou criar um bom menu
        // Algumas opções que o menu tem que ter, ou se for para inserir tem que ter as funções corretas
        
        //+----Acesso de colaborador comum----+\\
        // 1 - Ver Salário salário atual
        // 2 - Ver data de admissão
        // 3 - Ver Informações do departamento ao qual o colaborador pertence

        //----Acesso de administrador----\\
        // 1 - Cadastrar novo colaborador no banco de dados
        // 2 - Demitir colaborador
        // 3 - Cadastrar nova vaga
        // 4 - Cadastrar nova vaga aleatória
        // 5 - Demonstrar vagas em aberto
        // 6 - Validar estatísticas da empresa, como quantos colaboradores tem em cada área, Gerentes com maiores centro de custo à disposição...

        // Pessoa pessoaUm = new Pessoa();
        // pessoaUm.registrarPessoa("Emanuel");

        // Teste direto por POO deixa o código mais limpo
        ConexaoMySQL conexaoDatabase = new ConexaoMySQL();
        conexaoDatabase.testeConexao();

        Statement creator = conexaoDatabase.createStatement();
    }
}