package com.example.eldorado;

import java.sql.Date;

public class Cargo {
    private String nome;
    private int salario;
    private Date data_contratacao;

    // Nome
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Salario
    public int getSalario() {
        return this.salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    // Data de contratação para fazer as contas
    public Date getData_contratacao() {
        return this.data_contratacao;
    }

    public void setData_contratacao(Date data_contratacao) {
        this.data_contratacao = data_contratacao;
    }

}
