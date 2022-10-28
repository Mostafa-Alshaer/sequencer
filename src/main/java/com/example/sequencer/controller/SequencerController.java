package com.example.sequencer.controller;

import com.example.sequencer.service.SequencerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sequencer")
public class SequencerController {

    @Autowired
    private SequencerService sequencerService;

    @GetMapping()
    public ResponseEntity<Long> getNextNumber(){
        Long nextNumber = sequencerService.getNextNumber();
        return ResponseEntity.status(HttpStatus.OK).body(nextNumber);
    }
}
