package com.example.eldorado;
// imports
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Pessoa {
    private String nome;
    private String cpf;
    private Date data_nasc;
    private String conta;
    private boolean comprovante_em;
    private boolean comprovante_facul;
    private boolean cnh;
    private boolean mba;

    // -- Não faz sentido colocar ID nisso aqui, já que vai funcionar na base do auto increment -- \\
    // Nome
    public String getNome() {
        return this.nome;
    }

    // CPF
    public String getCpf() {
        return this.cpf;
    }

    // Data de nascimento dos colaboradores
    public Date getData_nasc() {
        return this.data_nasc;
    }

    // Número de conta bancária
    public String getConta() {
        return this.conta;
    }

    // Comprovante de Ensino médio
    public boolean isComprovante_em() {
        return this.comprovante_em;
    }

    // Comprovante de faculdade
    public boolean isComprovante_facul() {
        return this.comprovante_facul;
    }

    //CNH 
    public boolean isCnh() {
        return this.cnh;
    }

    // MBA
    public boolean isMba() {
        return this.mba;
    }

//---------------------------------------------------+Setando Set's+-------------------------------------------------------\\

    //CPF
    public void setCpf(String cpf) {
        // Remover caracteres não numéricos do CPF
        String cpfSemMascara = cpf.replaceAll("[^0-9]", "");

        // Verificar se o CPF tem 11 dígitos
        if (cpfSemMascara.length() != 11) {
            throw new IllegalArgumentException("CPF inválido: Insira um CPF em formato válido!!.");
        }

        // Formatar o CPF com a máscara
        this.cpf = cpfSemMascara.substring(0, 3) + "." +
                cpfSemMascara.substring(3, 6) + "." +
                cpfSemMascara.substring(6, 9) + "-" +
                cpfSemMascara.substring(9);

    }

    //mba
    public void setMba(boolean mba) {
        this.mba = mba;
    }

    // CNH
    public void setCnh(boolean cnh) {
        this.cnh = cnh;
    }

    // Comprovante da faculdade
    public void setComprovante_facul(boolean comprovante_facul) {
        this.comprovante_facul = comprovante_facul;
    }

    //Comprovante de Ensino médio 
    public void setComprovante_em(boolean comprovante_em) {
        this.comprovante_em = comprovante_em;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setData_nasc(Date data_nasc) {
        this.data_nasc = data_nasc;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }


    //-----------------------------+Métodos próprios+-----------------------------\\
    // Função para registrar Pessoa na memória em tempo real
    public void registrarPessoa (String nomePessoa) throws ParseException{
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = dataFormatada.parse("22/04/2003");
        // Primeira pessoa colocada como objeto
        Pessoa pessoaUm = new Pessoa();
        pessoaUm.setNome(nomePessoa);
        pessoaUm.setConta("13423-3");
        pessoaUm.setData_nasc(dataNascimento);
        pessoaUm.setCpf("123.456.789-00");
        pessoaUm.setComprovante_em(true);
        pessoaUm.setCnh(false);
        pessoaUm.setMba(false);
        // Printando o resultado de tudo
        System.out.println(pessoaUm.getCpf());
    }
}