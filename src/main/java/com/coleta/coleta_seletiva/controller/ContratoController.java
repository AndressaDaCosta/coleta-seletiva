package com.coleta.coleta_seletiva.controller;

import com.coleta.coleta_seletiva.model.Contrato;
import com.coleta.coleta_seletiva.service.ContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contratos")
public class ContratoController {

    @Autowired
    private ContratoService contratoService;

    @PostMapping("/{coletorId}")
    public void registrar(@PathVariable int coletorId, @RequestBody List<Integer> rotasIds) {
        contratoService.registrar(coletorId, rotasIds);
    }

    @GetMapping
    public List<Contrato> listar() {
        return contratoService.listar();
    }
}
