package com.example.workindia.dinningreservation.controllers;

import com.example.workindia.dinningreservation.dto.DinningDTO;
import com.example.workindia.dinningreservation.service.DinningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dinning-place")
public class DinningController {

    @Autowired
    private DinningService dinningService;

    public ResponseEntity<DinningDTO> createDinning(@RequestBody DinningDTO dinningDTO){
        return new ResponseEntity<>(dinningService.createDinning(dinningDTO), HttpStatus.CREATED);
    }


}
