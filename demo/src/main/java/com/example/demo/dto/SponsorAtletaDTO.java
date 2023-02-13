package com.example.demo.dto;

public class SponsorAtletaDTO {

    private int id;

    private int idAtleta;

    public SponsorAtletaDTO(int id, int idAtleta) {
        this.id = id;
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
