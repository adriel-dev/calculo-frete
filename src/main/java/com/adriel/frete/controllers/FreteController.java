package com.adriel.frete.controllers;

import com.adriel.frete.services.FreteService;
import com.adriel.frete.util.ResponseModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController @RequestMapping(value = "/frete")
@Api(value = "Consulta Frete") @CrossOrigin(origins = "*")
@ApiResponses(value = {
    @ApiResponse(code = 200, message = "OK"),
    @ApiResponse(code = 400, message = "Erro!!")})
public class FreteController {
    
    @Autowired
    FreteService freteService;

    @GetMapping @ApiOperation(value = "Retorna o valor do frete e a data prevista de entrega.")
    public ResponseModel consultaFrete(@RequestParam Float peso, @RequestParam String cepOrigem, @RequestParam String cepDestino,
    @RequestParam String nomeDestinatario)
    {
        return freteService.consultarFrete(peso, cepOrigem, cepDestino, nomeDestinatario);
    }

}
