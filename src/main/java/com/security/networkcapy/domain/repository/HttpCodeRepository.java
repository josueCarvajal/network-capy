package com.security.networkcapy.domain.repository;

import com.security.networkcapy.persistence.entity.HttpCode;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface HttpCodeRepository {
    public List<HttpCode> getAll();
    public Optional<HttpCode> getByCode(int codeId);

}
