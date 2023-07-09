package com.mycompany.myfirstprojectjava.model;

/**
 *
 * @author lucas
 */
public class Foliao {
    private String cpf;
    private String rg;
    private String nome;
    private int idade;
    private Transporte transporte;

    public Foliao(String cpf, String rg, String nome, int idade) {
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void registra(Transporte transporte) {
        this.transporte = transporte;
    }

    public Transporte getTransporte() {
        return transporte;
    }
}
