package com.adriel.frete.util;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ResponseModel {
   
    private Float vlTotalFrete;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", timezone = "GMT")
    private Instant dataPrevistaEntrega;

    public ResponseModel(){}

    public ResponseModel(Float vlTotalFrete, Instant dataPrevistaEntrega) {
        this.vlTotalFrete = vlTotalFrete;
        this.dataPrevistaEntrega = dataPrevistaEntrega;
    }
    
    public Float getVlTotalFrete() {
        return vlTotalFrete;
    }
    public void setVlTotalFrete(Float vlTotalFrete) {
        this.vlTotalFrete = vlTotalFrete;
    }
    public Instant getDataPrevistaEntrega() {
        return dataPrevistaEntrega;
    }
    public void setDataPrevistaEntrega(Instant dataPrevistaEntrega) {
        this.dataPrevistaEntrega = dataPrevistaEntrega;
    }

}
