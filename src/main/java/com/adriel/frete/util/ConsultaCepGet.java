package com.adriel.frete.util;

import org.springframework.web.client.RestTemplate;

public class ConsultaCepGet {
    
    public static ConsultaCep getCepData(String cep){
        String url = "https://viacep.com.br/ws/"+cep+"/json/";

        RestTemplate restTemplate = new RestTemplate();
        ConsultaCep response = restTemplate.getForObject(url, ConsultaCep.class);
        return response;
    }

}
