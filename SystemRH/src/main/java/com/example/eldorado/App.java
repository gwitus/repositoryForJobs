package com.example.eldorado;

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
    

        Connection conexao = ConexaoMySQL.obterConexao();
        if (conexao != null) {
            System.out.println("Conexão estabelecida com sucesso!");
            // Aqui você pode realizar operações no banco de dados
            // Exemplo: executar queries, inserir dados, etc.
        } else {
            System.out.println("Não foi possível estabelecer a conexão.");
        }
    
        Pessoa pessoaUm = new Pessoa();
        pessoaUm.registrarPessoa("Emanuel");
    
    }
}