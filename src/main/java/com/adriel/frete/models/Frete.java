package com.adriel.frete.models;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Frete implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cepOrigem;
    private String cepDestino;
    private Float peso;
    private String nomeDestinatario;
    private Float vlTotalFrete;
    private Instant dataPrevistaEntrega;
    private Instant dataConsulta;

    public Frete() {}

    public Frete(Long id, String cepOrigem, String cepDestino, Float peso, String nomeDestinatario, Float vlTotalFrete,
            Instant dataPrevistaEntrega, Instant dataConsulta) {
        this.id = id;
        this.cepOrigem = cepOrigem;
        this.cepDestino = cepDestino;
        this.peso = peso;
        this.nomeDestinatario = nomeDestinatario;
        this.vlTotalFrete = vlTotalFrete;
        this.dataPrevistaEntrega = dataPrevistaEntrega;
        this.dataConsulta = dataConsulta;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCepOrigem() {
        return cepOrigem;
    }
    public void setCepOrigem(String cepOrigem) {
        this.cepOrigem = cepOrigem;
    }
    public String getCepDestino() {
        return cepDestino;
    }
    public void setCepDestino(String cepDestino) {
        this.cepDestino = cepDestino;
    }
    public Float getPeso() {
        return peso;
    }
    public void setPeso(Float peso) {
        this.peso = peso;
    }
    public String getNomeDestinatario() {
        return nomeDestinatario;
    }
    public void setNomeDestinatario(String nomeDestinatario) {
        this.nomeDestinatario = nomeDestinatario;
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
    public Instant getDataConsulta() {
        return dataConsulta;
    }
    public void setDataConsulta(Instant dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

}
