package com.adriel.frete.services;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import com.adriel.frete.models.Frete;
import com.adriel.frete.repositories.FreteRepository;
import com.adriel.frete.util.ConsultaCep;
import com.adriel.frete.util.ConsultaCepGet;
import com.adriel.frete.util.ResponseModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FreteService {
    
    @Autowired
    private FreteRepository freteRepository;

    private final Float valorKgFrete = 1f;
    private Float vlTotalFrete;
    private Instant dataPrevistaEntrega; 

    public ResponseModel consultarFrete(Float peso, String cepOrigem, String cepDestino, String nomeDestinatario){

        ConsultaCep cepOrigemDados = ConsultaCepGet.getCepData(cepOrigem);
        ConsultaCep cepDestinoDados = ConsultaCepGet.getCepData(cepDestino);

        dataPrevistaEntrega = Instant.now();
        vlTotalFrete = valorKgFrete * peso;
        
        if (cepOrigemDados.getDdd().equals(cepDestinoDados.getDdd())){
            vlTotalFrete -= vlTotalFrete * 0.50f;
            dataPrevistaEntrega = dataPrevistaEntrega.plus(1, ChronoUnit.DAYS);
        }else if (cepOrigemDados.getUf().equals(cepDestinoDados.getUf())){
            vlTotalFrete -= vlTotalFrete * 0.75f;
            dataPrevistaEntrega = dataPrevistaEntrega.plus(3, ChronoUnit.DAYS);
        }else{
            dataPrevistaEntrega = dataPrevistaEntrega.plus(10, ChronoUnit.DAYS);
        }

        freteRepository.save(new Frete(null, cepOrigem, cepDestino, peso, nomeDestinatario, vlTotalFrete, 
        dataPrevistaEntrega, Instant.now()));

        return new ResponseModel(vlTotalFrete, dataPrevistaEntrega);

    }

}
