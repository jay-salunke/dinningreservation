package com.example.workindia.dinningreservation.repository;

import com.example.workindia.dinningreservation.entities.Dinning;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DinningRepository extends JpaRepository<Dinning,Integer> {

    Dinning findDinningByName(String dinningName);
}
