package com.example.demo;

import com.example.demo.dto.SponsorAtletaDTO;
import com.example.demo.modello.Atleta;
import com.example.demo.modello.Gara;
import com.example.demo.modello.Sponsor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "sponsor")
public class SponsorController {

    @Autowired
    private SponsorService sponsorService;

    @PostMapping(path = "/inserimento")
    public void inserimento (@RequestBody Sponsor sponsor){
        sponsorService.inserimento(sponsor);
    }

    @GetMapping(path = "/findAll") //http -v get localhost:8080/findAll
    public List<Sponsor> findAll(){
        return sponsorService.findAll();
    }

    @GetMapping (path = "/findById")  //http -v get localhost:8080/findById id==200
    public Sponsor findSponsorById(@RequestParam int id){
        return sponsorService.findById(id);
    }

    @PostMapping(path = "/aggiungiAtleta")
    public void aggiungiAtleta (@RequestBody @Valid SponsorAtletaDTO sponsorAtletaDTO){
        sponsorService.aggiungiAtleta(sponsorAtletaDTO.getId(), sponsorAtletaDTO.getIdAtleta());
    }

    @DeleteMapping (path = "/elimina")
    public void elimina (@RequestBody int id){
        sponsorService.elimina(id);
    }

    @PutMapping (path = "/modifica")
    public void modifica (@RequestBody int id, String nome, String tipologia){
        sponsorService.modifica(id, nome, tipologia);
    }

}
