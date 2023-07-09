package com.mycompany.myfirstprojectjava.model;

/**
 *
 * @author lucas
 */
public class Bloco {
    private int id;
    private String nome;
    private String local;
    private int saida;

    // Construtor
    public Bloco(int id, String nome, String local, int saida) {
        this.id = id;
        this.nome = nome;
        this.local = local;
        this.saida = saida;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getSaida() {
        return saida;
    }

    public void setSaida(int saida) {
        this.saida = saida;
    }
}
