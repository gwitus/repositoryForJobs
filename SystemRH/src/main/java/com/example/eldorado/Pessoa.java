package com.example.eldorado;
// Importações de biblioteca
import java.io.Console;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {
    private String nome;
    private String cpf;
    private String data_nasc;
    private String conta;
    private boolean comprovante_em;
    private boolean comprovante_facul;
    private String cnh;
    private boolean mba;

    // Get e Set pertinentes
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // váriaveis globais
    ConexaoMySQL connectionDatabase = new ConexaoMySQL(); 
    Console console = System.console();

    // Ordem natural de associação: 
    // 1_nome, 2_cpf, 3_dataNascimento, 4_Conta, 5_ComprovanteEM, 6_ComprovanteFacul, 7_mba e 8_CNH
    public void cadastrarCandidato() throws ParseException {
        nome                       = console.readLine("Nome: ");
        cpf                        = console.readLine("CPF: ");
        conta                      = console.readLine("Número da conta bancária: ");
        cnh                        = console.readLine("Letra da CNH: ");
        // Modelo de input : dd/mm/yyyy
        String nascimento          = console.readLine("Data de nascimento: ");
        // Todos os booleanos em origem tem de ter apenas a primeira letra inserida, ou vai dar problema
        String comprovanteEm       = console.readLine("Obtém comprovante do ensino médio?: ");
        String comprovanteFacul    = console.readLine("Obtém comprovante do ensino superior?: ");
        String MBA                 = console.readLine("Obtém MBA?: ");
        
        //Convertedor de dados booleanos comprovante Ensino médio
        if (comprovanteEm.equalsIgnoreCase("T") || comprovanteEm.equalsIgnoreCase("t")) {
            this.comprovante_em = true;
        } else if (comprovanteEm.equalsIgnoreCase("F") || comprovanteEm.equalsIgnoreCase("f")) {
            this.comprovante_em = false;
        } else {
            System.out.println("Paramêtro inválido!");
            System.exit(1);
        }

        //Convertedor de dados booleanos comprovante Faculdade
        if (comprovanteEm.equalsIgnoreCase("T") || comprovanteFacul.equalsIgnoreCase("t")) {
            this.comprovante_facul = true;
        } else if (comprovanteFacul.equalsIgnoreCase("F") || comprovanteFacul.equalsIgnoreCase("f")) {
            this.comprovante_facul = false;
        } else {
            System.out.println("Paramêtro inválido!");
            System.exit(1);
        }

        //mba
        //Convertedor de dados booleanos
        if (MBA.equalsIgnoreCase("T") || MBA.equalsIgnoreCase("t")) {
            this.mba = true;
        } else if (MBA.equalsIgnoreCase("F") || MBA.equalsIgnoreCase("f")) {
            this.mba = false;
        } else {
            System.out.println("Paramêtro inválido!");
            System.exit(1);
        }

        // Convertendo a String para o tipo date e inserção no banco

        // Antes de adicionar precisa fazer uma breve consultar no CPF para validar se já não existe
        try (Connection conexao = ConexaoMySQL.obterConexao()){
            SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
            
            String sql = "INSERT INTO candidatos (nome, cpf, data_nasc, conta, comprovante_em, comprovante_facul, mba, cnh, pontos) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            // Second Try Catch
            try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
                // pstmt.setString(1, nome);
                // pstmt.setString(2, cpf);
                // pstmt.setDate(3, dataSql);
                // pstmt.setString(4, conta);
                // pstmt.setBoolean(5, comprovante_em);
                // pstmt.setBoolean(6, comprovante_facul);
                // pstmt.setBoolean(7, mba);
                // pstmt.setString(8, cnh);
                // pstmt.setInt(9, validarPontos(mba, comprovante_facul, comprovante_em, dataSql));

                // Executando o insert
                // pstmt.executeUpdate();
                System.out.println("Pessoa cadastrada com sucesso!");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar pessoa: " + e.getMessage());
        }
    }


    //Pontos definidos Nome = 0, CPF = 0, Data = 0 se abaixo dos 50 anos, acima por cada ano perde 1 ponto, 
    // Conta = 0, Se tiver EM = 10, Se tiver Facul = 30, se tiver MBA = 40 e dependendo a letra da CNH = 30
    public int validarPontos(boolean ensinoMedio, boolean ensinoSuperior, boolean comprovanteMBA, String dataDeNascimento) {
        // Globais
        int pontos = 0;
        int resultado = 0;
        // Alimentando pontos
        if (ensinoMedio) {pontos = pontos + 10;}
        if (ensinoSuperior) {pontos = pontos +30;}
        if (comprovanteMBA) {pontos = pontos + 40;}
        
        // revalidar
        // if (calcularIdade(dataDeNascimento) > 50) {resultado = pontos - calcularIdade(dataDeNascimento) + 50;}

        return resultado;
    }

    // Função para calcular a diferença de idade, devido a política de soma de pontos para a organização
    public int calcularIdade(int dia, int mes, int ano) {
        // Validação de tamanho
        if (dia <= 0 || dia > 31) {System.exit(1);}
        if (mes <= 0 || mes > 12) {System.exit(1);}
        // Validando a questão de fevereiro ter no máximo 29 - o correto seria colocar aqui uma validação de ano bissexto mas estou com preguiça kkkkkk.
        if (ano < 0 || dia > 31 || dia > 29 && mes == 2 )  {
            System.out.println("Entrada mês ou ano inválida!");
            System.exit(1);
            // validarBissexto(ano);
        }
        // Date dataNascimento = new Date(103, 3, 22); // 22/04/2003

        
        return 0;
    }
}