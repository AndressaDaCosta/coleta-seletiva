package com.coleta.coleta_seletiva.model;

import java.util.List;

public class Contrato {
    private static int contador = 1;

    private final int id;
    private final Coletor coletor;
    private final List<Rota> rotas;

    public Contrato(Coletor coletor, List<Rota> rotas) {
        this.id = contador++;
        this.coletor = coletor;
        this.rotas = rotas;
    }

    public int getId() {
        return id;
    }

    public Coletor getColetor() {
        return coletor;
    }

    public List<Rota> getRotas() {
        return rotas;
    }
}
