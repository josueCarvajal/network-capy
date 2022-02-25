package com.security.networkcapy.domain.service;

import com.security.networkcapy.domain.repository.PortRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sound.sampled.Port;
import java.util.List;
import java.util.Optional;

@Service
public class PortService {
    @Autowired
    private PortRepository portRepository;

    public List<Port> getAll(){
        return portRepository.getAll();
    }

    public Optional<Port> getByPort(int port){
        return portRepository.getByPort(port);
    }

}
