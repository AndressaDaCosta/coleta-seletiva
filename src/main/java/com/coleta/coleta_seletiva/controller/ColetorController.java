package com.coleta.coleta_seletiva.controller;

import com.coleta.coleta_seletiva.model.Coletor;
import com.coleta.coleta_seletiva.service.ColetorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coletores")
public class ColetorController {

    @Autowired
    private ColetorService coletorService;

    @PostMapping
    public void cadastrar(@RequestBody Coletor coletor) {
        coletorService.cadastrar(coletor);
    }

    @GetMapping
    public List<Coletor> listar() {
        return coletorService.getColetores();
    }
}