package com.security.networkcapy.domain.repository;

import com.security.networkcapy.persistence.entity.OsiModel;

import java.util.List;
import java.util.Optional;

public interface OsiModelRepository {
    public List<OsiModel> getAll();
    public Optional<OsiModel> getByLayer(int layerId);
}
