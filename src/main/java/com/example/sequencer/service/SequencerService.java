package com.example.sequencer.service;

import com.example.sequencer.entity.SequencerEntity;
import com.example.sequencer.repository.ISequencerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SequencerService {

    @Autowired
    private ISequencerRepository sequencerRepository;

    public Long getNextNumber(){
        Long nextNumber = sequencerRepository.save(new SequencerEntity()).getId();
        sequencerRepository.deleteById(nextNumber);
        return nextNumber;
    }
}
