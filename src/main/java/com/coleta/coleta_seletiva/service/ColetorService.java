package com.coleta.coleta_seletiva.service;

import com.coleta.coleta_seletiva.model.Coletor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service 
public class ColetorService {
    private static final List<Coletor> coletores = new ArrayList<>();

    public void cadastrar(Coletor coletor) {
        coletores.add(coletor);
    }

    public List<Coletor> getColetores() {
        return coletores;
    }

    public Coletor buscarPorId(int id) {
        return coletores.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }
}