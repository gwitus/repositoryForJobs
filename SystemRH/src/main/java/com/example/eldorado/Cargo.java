package com.example.eldorado;

import java.sql.Date;

public class Cargo extends Departamento{
    private String funcao;
    private int salario;
    private Date data_contratacao;

    // Nome
    public String getNomeDepartamento() {
        return this.funcao;
    }

    public void setNomeDepartamento(String funcao) {
        this.funcao = funcao;
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
