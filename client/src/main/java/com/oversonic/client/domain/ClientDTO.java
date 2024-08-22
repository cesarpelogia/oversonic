package com.oversonic.client.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ca_15")
public class ClientDTO{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long CPID;

    @JsonProperty("nome")
    private String CA15_NOME;
    
    private Date CA15_DATA = new Date();
    @JsonProperty("genero")
    private String CA15_GENERO;

    private String CA15_STATUS = "A";

    @JsonProperty("cpf")
    private String CA15_CPF;

    @JsonProperty("celular")
    private String CA15_CELULAR;

    @JsonProperty("cep")
    private String CA15_CEP;

    @JsonProperty("regiao")
    private String CA15_REGIAO;

    @JsonProperty("endereco")
    private String CA15_ENDEREC;

    @JsonProperty("numero")
    private String CA15_NUM;

    @JsonProperty("bairro")
    private String CA15_BAIRRO;

    @JsonProperty("municipio")
    private String CA15_MUNICP;

    @JsonProperty("estado")
    private String CA15_ESTADO;

    @JsonProperty("complemento")
    private String CA15_COMPLEM;

    @JsonProperty("estilo")
    private String CA15_ESTILO_MUSIC;

    @JsonProperty("midia")
    private String CA15_TIPO_MIDIA;
    
    @JsonProperty("email")
    private String CA15_EMAIL;


    public long getCPID() {
        return CPID;
    }
    public String getCA15_NOME() {
        return CA15_NOME;
    }
    public void setCA15_NOME(String CA15_NOME) {
        this.CA15_NOME = CA15_NOME;
    }
    public Date getCA15_DATA() {
        return CA15_DATA;
    }

    public void setCA15_DATA(Date CA15_DATA) {
        this.CA15_DATA = CA15_DATA;
    }

    public String getCA15_GENERO() {
        return CA15_GENERO;
    }

    public void setCA15_GENERO(String CA15_GENERO) {
        this.CA15_GENERO = CA15_GENERO;
    }

    public String getCA15_STATUS() {
        return CA15_STATUS;
    }

    public void setCA15_STATUS(String CA15_STATUS) {
        this.CA15_STATUS = CA15_STATUS;
    }

    public String getCA15_CPF() {
        return CA15_CPF;
    }

    public void setCA15_CPF(String CA15_CPF) {
        this.CA15_CPF = CA15_CPF;
    }

    public String getCA15_CELULAR() {
        return CA15_CELULAR;
    }

    public void setCA15_CELULAR(String CA15_CELULAR) {
        this.CA15_CELULAR = CA15_CELULAR;
    }

    public String getCA15_CEP() {
        return CA15_CEP;
    }

    public void setCA15_CEP(String CA15_CEP) {
        this.CA15_CEP = CA15_CEP;
    }

    public String getCA15_REGIAO() {
        return CA15_REGIAO;
    }

    public void setCA15_REGIAO(String CA15_REGIAO) {
        this.CA15_REGIAO = CA15_REGIAO;
    }

    public String getCA15_ENDEREC() {
        return CA15_ENDEREC;
    }

    public void setCA15_ENDEREC(String CA15_ENDEREC) {
        this.CA15_ENDEREC = CA15_ENDEREC;
    }

    public String getCA15_NUM() {
        return CA15_NUM;
    }

    public void setCA15_NUM(String CA15_NUM) {
        this.CA15_NUM = CA15_NUM;
    }

    public String getCA15_BAIRRO() {
        return CA15_BAIRRO;
    }

    public void setCA15_BAIRRO(String CA15_BAIRRO) {
        this.CA15_BAIRRO = CA15_BAIRRO;
    }

    public String getCA15_MUNICP() {
        return CA15_MUNICP;
    }

    public void setCA15_MUNICP(String CA15_MUNICP) {
        this.CA15_MUNICP = CA15_MUNICP;
    }

    public String getCA15_ESTADO() {
        return CA15_ESTADO;
    }

    public void setCA15_ESTADO(String CA15_ESTADO) {
        this.CA15_ESTADO = CA15_ESTADO;
    }

    public String getCA15_COMPLEM() {
        return CA15_COMPLEM;
    }

    public void setCA15_COMPLEM(String CA15_COMPLEM) {
        this.CA15_COMPLEM = CA15_COMPLEM;
    }

    public String getCA15_ESTILO_MUSIC() {
        return CA15_ESTILO_MUSIC;
    }

    public void setCA15_ESTILO_MUSIC(String CA15_ESTILO_MUSIC) {
        this.CA15_ESTILO_MUSIC = CA15_ESTILO_MUSIC;
    }

    public String getCA15_TIPO_MIDIA() {
        return CA15_TIPO_MIDIA;
    }

    public void setCA15_TIPO_MIDIA(String CA15_TIPO_MIDIA) {
        this.CA15_TIPO_MIDIA = CA15_TIPO_MIDIA;
    }

    public String getCA15_EMAIL() {
        return CA15_EMAIL;
    }

    public void setCA15_EMAIL(String CA15_EMAIL) {
        this.CA15_EMAIL = CA15_EMAIL;
    }
}
