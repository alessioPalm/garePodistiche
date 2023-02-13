package com.example.demo.modello;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Atleta {
    //@Min(10) @Max(100)
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    private String nome;
    private String congome;

    private String citta;

    @ManyToOne(cascade = CascadeType.ALL)
    private Sponsor sponsor;

    @ManyToMany(mappedBy = "listaAtleta", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List <Gara> listGara ;

}
