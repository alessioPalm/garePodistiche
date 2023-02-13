package com.example.demo;

import com.example.demo.dto.GaraDto;
import com.example.demo.exceptions.AtletaNotFoundException;
import com.example.demo.exceptions.GaraNotFoundException;
import com.example.demo.modello.Atleta;
import com.example.demo.modello.Gara;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class GaraService {

    @Autowired
    private GaraRepository garaRepository;
    @Autowired
    private AtletaRepository atletaRepository;

    public void inserimento(Gara gara) {
        garaRepository.save(gara);
    }

    public List<Gara> findAll() {
        return garaRepository.findAll();
    }

    public Gara findById(int id) {
        return garaRepository.findById(id).get();
    }

    public void aggiungiAtleta(int id, int idAtleta) {
        Gara gara = garaRepository.findById(id).orElseThrow(GaraNotFoundException::new);
        log.info("trovata gara {}", gara);
        Atleta atleta = atletaRepository.findById(idAtleta).orElseThrow(AtletaNotFoundException::new);
        log.info("trovato atleta {}", atleta);

        gara.getListaAtleta().add(atleta);
        garaRepository.save(gara);

    }

    public void elimina(int id) {
        garaRepository.deleteById(id);
    }

    public void modifica(int id, int codice, String descrizione, int lunchezzakm) {
        Gara gara = garaRepository.findById(id).get();
        gara.setCodice(codice);
        gara.setDescrizione(descrizione);
        gara.setLunchezzaKm(lunchezzakm);
        garaRepository.save(gara);
    }

    public List <GaraDto> findAllByLunghezzaKmOrderByLunghezzaKmAsc (int lunghezzaKm){

        /*List <GaraDto> lista = new ArrayList<GaraDto>();
        for(Gara gara : garaRepository.findAll()){
            lista.add(GaraDto.from(gara));
        }

        return lista;*/

        return garaRepository.findByLunchezzaKmLessThanEqualOrderByLunchezzaKm(lunghezzaKm).stream().map(GaraDto::from).collect(Collectors.toList());

    }
}
