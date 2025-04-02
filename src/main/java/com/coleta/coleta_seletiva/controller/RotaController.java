package com.coleta.coleta_seletiva.controller;

import com.coleta.coleta_seletiva.model.Rota;
import com.coleta.coleta_seletiva.service.RotaService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/rotas")
public class RotaController {

    @Autowired
    private RotaService rotaService;

    @PostMapping
    public void cadastrar(@RequestBody Rota rota) {
        rotaService.cadastrar(rota);
    }

    @GetMapping
    public List<Rota> listar() {
        return rotaService.getRotas();
    }
}