package com.example.demo;

import com.example.demo.modello.Atleta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/atleta")
public class AtletaController {

    @Autowired
    private AtletaService atletaService;

    @PostMapping(path = "/inserimento")  //http -v post localhost:8080/inserimento congome=franco nome=alessio id=200
    public void inserimento(@RequestBody Atleta atleta){
        atletaService.inserimento(atleta);
    }

    @GetMapping (path = "/findAll") //http -v get localhost:8080/findAll
    public List<Atleta> findAllAtleti(){
        return atletaService.findAllAtleti();
    }

    @GetMapping (path = "/findById")  //http -v get localhost:8080/findById id==200
    public Atleta findAtletaById(@RequestParam int id){
        return atletaService.findById(id);
    }

    @DeleteMapping (path = "/elimina")
    public void elimina(@RequestBody int id){
        atletaService.elimina(id);
    }

    @PutMapping (path = "/modifica")
    public void modifica(@RequestBody int id, String nome, String cognome, String citta){
        atletaService.modifica(id, nome, cognome, citta);
    }
}
