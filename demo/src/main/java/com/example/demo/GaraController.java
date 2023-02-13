package com.example.demo;

import com.example.demo.dto.AtletaGaraIdDto;
import com.example.demo.dto.GaraDto;
import com.example.demo.modello.Atleta;
import com.example.demo.modello.Gara;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "gara")
@Validated
public class GaraController {

    @Autowired
    private GaraService garaService;

    @PostMapping(path = "/inserimento")  //http -v post localhost:8080/inserimento congome=franco nome=alessio id=200
    public void inserimento(@RequestBody Gara gara){
        garaService.inserimento(gara);
    }

    @GetMapping(path = "/findAll") //http -v get localhost:8080/findAll
    public List<Gara> findAllAtleti(){
        return garaService.findAll();
    }

    @GetMapping (path = "/findById")  //http -v get localhost:8080/findById id==200
    public Gara findAtletaById(@RequestParam int id){
        return garaService.findById(id);
    }

    @PostMapping(path = "/aggiungiAtleta")
    public void aggiungiAtleta(@RequestBody @Valid AtletaGaraIdDto atletaGaraIdDto){

        garaService.aggiungiAtleta(atletaGaraIdDto.getId(), atletaGaraIdDto.getIdAtleta());

    }

    @DeleteMapping(path = "/elimina")
    public void elimina(@RequestBody int id){
        garaService.elimina(id);
    }

    @PutMapping (path = "/modifica")
    public void modifica(@RequestBody int id, int codice, String descrizione, int lunchezzaKm){

        garaService.modifica(id, codice, descrizione, lunchezzaKm);
    }

    @GetMapping (path = "/findAllByLunghezza")
    public List <GaraDto> findAllByLunghezzaKmOrderByLunghezzaKmAsc (@RequestParam int lunghezzaKm){

        return garaService.findAllByLunghezzaKmOrderByLunghezzaKmAsc(lunghezzaKm);
    }
}
