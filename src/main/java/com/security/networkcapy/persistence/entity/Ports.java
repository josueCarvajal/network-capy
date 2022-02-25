package com.security.networkcapy.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "ports")
public class Ports {
    @Id
    @Column(name="port_number")
    private Integer portNumber;

    private String name;

    private String description;

    public Integer getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(Integer portNumber) {
        this.portNumber = portNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
