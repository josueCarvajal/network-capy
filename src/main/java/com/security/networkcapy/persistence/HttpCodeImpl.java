package com.security.networkcapy.persistence;

import com.security.networkcapy.domain.repository.HttpCodeRepository;
import com.security.networkcapy.persistence.crud.HttpCodeCrudRepository;
import com.security.networkcapy.persistence.entity.HttpCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class HttpCodeImpl implements HttpCodeRepository {

    @Autowired
    private HttpCodeCrudRepository httpCodeCrudRepository;

    @Override
    public List<HttpCode> getAll() {
        List<HttpCode> codes = (List<HttpCode>) httpCodeCrudRepository.findAll();
        return codes;
    }

    @Override
    public Optional<HttpCode> getByCode(int codeId) {
        return httpCodeCrudRepository.findById(codeId);
    }
}