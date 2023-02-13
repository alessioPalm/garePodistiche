package com.example.demo.dto;

import com.example.demo.modello.Gara;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GaraDto {

    private int id;

    private int codice;

    private String descrizione;

    private int lunchezzaKm;

    private LocalDate data;

    public static GaraDto from (Gara gara){
        return new GaraDto(gara.getId(), gara.getCodice(), gara.getDescrizione(), gara.getLunchezzaKm(), gara.getData());
    }
}
