package com.coleta.coleta_seletiva.model;

public class Coletor {
    private static int contador = 1;

    private final int id;
    private String nome;
    private String descricao;

    public Coletor() {
        this.id = contador++;
    }

    public Coletor(String nome, String descricao) {
        this.id = contador++;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }
    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}