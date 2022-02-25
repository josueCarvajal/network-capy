package com.security.networkcapy.domain.service;

import com.security.networkcapy.domain.repository.HttpCodeRepository;
import com.security.networkcapy.persistence.entity.HttpCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HttpCodeService {

    @Autowired
    private HttpCodeRepository httpCodeRepository;

    public List<HttpCode> getAll(){
        return httpCodeRepository.getAll();
    }

    public Optional<HttpCode> getByCode(int code){
        return httpCodeRepository.getByCode(code);
    }
}
