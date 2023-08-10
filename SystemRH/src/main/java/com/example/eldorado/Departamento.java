package com.example.eldorado;

public class Departamento extends Empresa{
    private String nomeDepartamento;
    private String PEP;
    private String CentroCusto;

    // Nome
    public String getNomeDepartamento() {
        return this.nomeDepartamento;
    }

    public void setNomeDepartamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }

    // Pep a qual aquele colaborador está inserido
    public String getPEP() {
        return this.PEP;
    }

    public void setPEP(String PEP) {
        this.PEP = PEP;
    }

    // Centro de custo a qual aquele colaborador está inserido
    public String getCentroCusto() {
        return this.CentroCusto;
    }

    public void setCentroCusto(String CentroCusto) {
        this.CentroCusto = CentroCusto;
    }

}
