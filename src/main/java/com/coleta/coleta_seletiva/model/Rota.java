package com.coleta.coleta_seletiva.model;

public class Rota {
    private static int contador = 1;
    

    private final int id;
    private String descricao;
    private String area;
    private double percentualEficiencia;

    public Rota() {
        this.id = contador++;
    }

    public Rota(String descricao, String area, double percentualEficiencia) {
        this.id = contador++;
        this.descricao = descricao;
        this.area = area;
        this.percentualEficiencia = percentualEficiencia;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getArea() {
        return area;
    }

    public double getPercentualEficiencia() {
        return percentualEficiencia;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setPercentualEficiencia(double percentualEficiencia) {
        this.percentualEficiencia = percentualEficiencia;
    }
}