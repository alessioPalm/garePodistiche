package com.example.demo;

import com.example.demo.modello.Atleta;
import com.example.demo.modello.Gara;
import com.example.demo.modello.Sponsor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SponsorService {
    @Autowired
    public SponsorRepository sponsorRepository;
    public AtletaRepository atletaRepository;

    public void inserimento(Sponsor sponsor){
        sponsorRepository.save(sponsor);
    }

    public List<Sponsor> findAll() {
        return sponsorRepository.findAll();
    }

    public Sponsor findById(int id) {
        return sponsorRepository.findById(id).get();
    }

    public void elimina (int id){
        sponsorRepository.deleteById(id);
    }

    public void modifica (int id, String nome, String tipologia){
       Sponsor sponsor = sponsorRepository.findById(id).get();
       sponsor.setNome(nome);
       sponsor.setTipologia(tipologia);
       sponsorRepository.save(sponsor);
    }
    public void aggiungiAtleta (int id, int idAtleta){
        Sponsor sponsor = sponsorRepository.findById(id).get();
        Atleta atleta = atletaRepository.findById(idAtleta).get();

        sponsor.getListaRelazioneAtletaSponsor().add(atleta);
        sponsorRepository.save(sponsor);
    }
}
