package com.oversonic.client.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "musica")
public class MusicDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @JsonProperty("nomeMusica")
    private String nomeMusica;

    @JsonProperty("estiloMusica")
    private String estiloMusica;

    @JsonProperty("cantores")
    private List<String> cantores;

    @JsonProperty("compositores")
    private List<String> compositores;

    public long getId() {
        return id;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public String getEstiloMusica() {
        return estiloMusica;
    }

    public void setEstiloMusica(String estiloMusica) {
        this.estiloMusica = estiloMusica;
    }

    public List<String> getCantores() {
        return cantores;
    }

    public void setCantores(List<String> cantores) {
        this.cantores = cantores;
    }

    public List<String> getCompositores() {
        return compositores;
    }

    public void setCompositores(List<String> compositores) {
        this.compositores = compositores;
    }
}