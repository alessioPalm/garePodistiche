package com.example.demo;

import com.example.demo.modello.Atleta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtletaRepository extends JpaRepository <Atleta, Integer>{

}
