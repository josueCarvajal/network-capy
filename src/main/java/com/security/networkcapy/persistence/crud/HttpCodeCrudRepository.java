package com.security.networkcapy.persistence.crud;

import com.security.networkcapy.domain.repository.HttpCodeRepository;
import com.security.networkcapy.persistence.entity.HttpCode;
import org.springframework.data.repository.CrudRepository;

public interface HttpCodeCrudRepository extends CrudRepository<HttpCode,Integer> {

}
