package com.coleta.coleta_seletiva.service;

import com.coleta.coleta_seletiva.model.Contrato;
import com.coleta.coleta_seletiva.model.Coletor;
import com.coleta.coleta_seletiva.model.Rota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContratoService {

    @Autowired
    private ColetorService coletorService;

    @Autowired
    private RotaService rotaService;

    private static final List<Contrato> contratos = new ArrayList<>();

    public void registrar(int coletorId, List<Integer> rotaIds) {
        Coletor coletor = coletorService.buscarPorId(coletorId);
        if (coletor == null)
            throw new RuntimeException("Coletor não encontrado");

        List<Rota> rotas = new ArrayList<>();
        for (int id : rotaIds) {
            Rota rota = rotaService.buscarPorId(id);
            if (rota != null)
                rotas.add(rota);
        }

        contratos.add(new Contrato(coletor, rotas));
    }

    public List<Contrato> listar() {
        return contratos;
    }
}
