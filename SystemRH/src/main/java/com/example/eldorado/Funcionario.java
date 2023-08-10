package com.example.eldorado;

public class Funcionario extends Pessoa {
    private int     matricula;
    private String  local;
    private boolean em_atividade;
    private boolean administrador;
    private String  usuarioAD;
    private String  senha;

    public String getusuarioAD() {
		return this.usuarioAD;
	}

    public void setUserAD(String usuarioAD) {
		this.usuarioAD = usuarioAD;
	}

    public String getSenha() {
		return this.senha;
	}

    public void setSenha(String senha) {
		this.senha = senha;
	}

    // Matricula
    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    // Local
    public String getLocal() {
        return this.local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    // Se foi demitido ou não
    public boolean isEm_atividade() {
        return this.em_atividade;
    }

    public void setEm_atividade(boolean em_atividade) {
        this.em_atividade = em_atividade;
    }

    // Se tem perfil administrador
    public boolean isAdministrador() {
        return this.administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }
}
