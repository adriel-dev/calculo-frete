package com.adriel.frete.controllers;

import com.adriel.frete.services.FreteService;
import com.adriel.frete.util.ResponseModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequestMapping(value = "/frete")
public class FreteController {
    
    @Autowired
    FreteService freteService;

    @GetMapping
    public ResponseModel consultaFrete(@RequestParam Float peso, @RequestParam String cepOrigem, @RequestParam String cepDestino,
    @RequestParam String nomeDestinatario)
    {
        return freteService.consultarFrete(peso, cepOrigem, cepDestino, nomeDestinatario);
    }

}
