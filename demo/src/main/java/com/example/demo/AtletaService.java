package com.example.demo;

import com.example.demo.modello.Atleta;
import com.example.demo.modello.Sponsor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AtletaService {

    @Autowired
    private AtletaRepository atletaRepository;

    public void inserimento (Atleta atleta){

        atletaRepository.save(atleta);
    }

    public List<Atleta> findAllAtleti(){
        return atletaRepository.findAll();
    }

    public Atleta findById (int id) {
        return atletaRepository.findById(id).get();
    }

    public void elimina (int id){
        atletaRepository.deleteById(id);
    }

    public void modifica (int id, String nome, String cognome, String citta){
        Atleta atleta = atletaRepository.findById(id).get();
        atleta.setNome(nome);
        atleta.setCongome(cognome);
        atleta.setCitta(citta);
        atletaRepository.save(atleta);
    }
}
