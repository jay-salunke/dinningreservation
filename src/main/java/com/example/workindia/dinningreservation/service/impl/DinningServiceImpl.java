package com.example.workindia.dinningreservation.service.impl;

import com.example.workindia.dinningreservation.dto.DinningDTO;
import com.example.workindia.dinningreservation.entities.Dinning;
import com.example.workindia.dinningreservation.exception.AlreadyExistsException;
import com.example.workindia.dinningreservation.repository.DinningRepository;
import com.example.workindia.dinningreservation.service.DinningService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DinningServiceImpl implements DinningService {

   @Autowired
    ModelMapper modelMapper;
   @Autowired
   DinningRepository dinningRepository;

    @Override
    public DinningDTO createDinning(DinningDTO dinningDTO) {
        Dinning dinning = dinningRepository.findDinningByName(dinningDTO.getName());
        if(dinning != null){
            throw new AlreadyExistsException("Dinning table already exists: "+dinning.getName(),dinning.getName());

        }
        dinningRepository.save(dinning);
        return modelMapper.map(dinning, DinningDTO.class);
    }
}
