package com.example.demo;


import com.example.demo.modello.Gara;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GaraRepository extends JpaRepository<Gara, Integer> {

    public List <Gara> findByLunchezzaKmLessThanEqualOrderByLunchezzaKm (Integer lunchezzaKm);
}
