package com.example.sequencer.entity;

import javax.persistence.*;

@Entity
@Table(name = "sequencer")
public class SequencerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id = 0;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
