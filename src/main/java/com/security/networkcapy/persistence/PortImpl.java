package com.security.networkcapy.persistence;

import com.security.networkcapy.domain.repository.PortRepository;
import com.security.networkcapy.domain.service.PortService;
import com.security.networkcapy.persistence.crud.PortCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sound.sampled.Port;
import java.util.List;
import java.util.Optional;

@Repository
public class PortImpl implements PortRepository {
    @Autowired
    private PortCrudRepository portCrudRepository;

    @Override
    public List<Port> getAll() {
        return (List<Port>) portCrudRepository.findAll();
    }

    @Override
    public Optional<Port> getByPort(int port) {
        return portCrudRepository.findById(port);
    }


}
