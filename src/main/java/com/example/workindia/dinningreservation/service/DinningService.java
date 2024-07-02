package com.example.workindia.dinningreservation.service;

import com.example.workindia.dinningreservation.dto.DinningDTO;
import com.example.workindia.dinningreservation.entities.Dinning;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DinningService{

    public DinningDTO createDinning(DinningDTO dinningDTO);
}
