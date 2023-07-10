package com.example.eldorado;
// imports
import java.util.Date;

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

    public void setNome(String nome) {
        this.nome = nome;
    }

    // CPF
    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Data de nascimento dos colaboradores
    public Date getData_nasc() {
        return this.data_nasc;
    }

    public void setData_nasc(Date data_nasc) {
        this.data_nasc = data_nasc;
    }

    // Número de conta bancária
    public String getConta() {
        return this.conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    // Comprovante de Ensino médio
    public boolean isComprovante_em() {
        return this.comprovante_em;
    }

    public void setComprovante_em(boolean comprovante_em) {
        this.comprovante_em = comprovante_em;
    }

    // Comprovante de faculdade
    public boolean isComprovante_facul() {
        return this.comprovante_facul;
    }

    public void setComprovante_facul(boolean comprovante_facul) {
        this.comprovante_facul = comprovante_facul;
    }

    //CNH 
    public boolean isCnh() {
        return this.cnh;
    }

    public void setCnh(boolean cnh) {
        this.cnh = cnh;
    }

    // MBA
    public boolean isMba() {
        return this.mba;
    }

    public void setMba(boolean mba) {
        this.mba = mba;
    }
}
