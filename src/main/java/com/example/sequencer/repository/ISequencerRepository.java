package com.example.sequencer.repository;

import com.example.sequencer.entity.SequencerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISequencerRepository extends JpaRepository<SequencerEntity, Long> {
}
