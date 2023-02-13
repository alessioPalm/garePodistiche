package com.example.demo.modello;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.example.demo.modello.Atleta;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Gara {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int codice;

    private String descrizione;

    private Integer lunchezzaKm;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate data;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable( name = "relazioneGaraAtleta", joinColumns = @JoinColumn(name = "gara_id"),
            inverseJoinColumns = @JoinColumn(name = "atltea_id"))
    private List <Atleta> listaAtleta;



}
