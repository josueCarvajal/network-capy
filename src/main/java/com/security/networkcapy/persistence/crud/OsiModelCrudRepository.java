package com.security.networkcapy.persistence.crud;

import com.security.networkcapy.persistence.entity.OsiModel;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface OsiModelCrudRepository extends CrudRepository<OsiModel,Integer> {
}
