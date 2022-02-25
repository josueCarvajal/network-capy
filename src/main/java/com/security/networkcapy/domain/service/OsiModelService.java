package com.security.networkcapy.domain.service;

import com.security.networkcapy.domain.repository.OsiModelRepository;
import com.security.networkcapy.persistence.entity.OsiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OsiModelService {
    @Autowired
    private OsiModelRepository osiModelRepository;

    public List<OsiModel> getAll(){
        return osiModelRepository.getAll();
    }
    public Optional<OsiModel> getByLayer(int layerId){
        return osiModelRepository.getByLayer(layerId);
    }
}
