package com.coleta.coleta_seletiva.service;

import com.coleta.coleta_seletiva.model.Rota;
import org.springframework.stereotype.Service; 
import java.util.ArrayList;
import java.util.List;

@Service
public class RotaService {
    private static final List<Rota> rotas = new ArrayList<>();

    public void cadastrar(Rota rota) {
        rotas.add(rota);
    }

    public List<Rota> getRotas() {
        return rotas;
    }

    public Rota buscarPorId(int id) {
        return rotas.stream().filter(r -> r.getId() == id).findFirst().orElse(null);
    }
}