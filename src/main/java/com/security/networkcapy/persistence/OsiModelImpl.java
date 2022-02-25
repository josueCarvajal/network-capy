package com.security.networkcapy.persistence;

import com.security.networkcapy.domain.repository.OsiModelRepository;
import com.security.networkcapy.persistence.crud.OsiModelCrudRepository;
import com.security.networkcapy.persistence.entity.OsiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class OsiModelImpl implements OsiModelRepository {

    @Autowired
    private OsiModelCrudRepository crudRepository;


    @Override
    public List<OsiModel> getAll() {
        return (List<OsiModel>) crudRepository.findAll();
    }

    @Override
    public Optional<OsiModel> getByLayer(int layerId) {
        return crudRepository.findById(layerId);
    }
}
