package com.security.networkcapy.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "osi_model")
public class OsiModel {

    @Id
    @Column(name = "layer_id")
    private Integer layerId;

    private String name;

    private String description;

    private String example;
}
