package com.example.eldorado;

public class Departamento {
    private String nome;
    private String PEP;
    private String CC;

    // Nome
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Pep a qual aquele colaborador está inserido
    public String getPEP() {
        return this.PEP;
    }

    public void setPEP(String PEP) {
        this.PEP = PEP;
    }

    // Centro de custo a qual aquele colaborador está inserido
    public String getCC() {
        return this.CC;
    }

    public void setCC(String CC) {
        this.CC = CC;
    }

}
