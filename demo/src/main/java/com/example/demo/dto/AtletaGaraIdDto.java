package com.example.demo.dto;

import javax.validation.constraints.Positive;

public class AtletaGaraIdDto {

    @Positive
    private int id;
    @Positive
    private int idAtleta;

    public AtletaGaraIdDto(int id , int idAtleta){
        this.id= id;
        this.idAtleta = idAtleta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdAtleta() {
        return idAtleta;
    }

    public void setIdAtleta(int idAtleta) {
        this.idAtleta = idAtleta;
    }
}
