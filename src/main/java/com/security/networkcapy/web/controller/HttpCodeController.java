package com.security.networkcapy.web.controller;

import com.security.networkcapy.domain.service.HttpCodeService;
import com.security.networkcapy.persistence.entity.HttpCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/http/code")
public class HttpCodeController {
    @Autowired
    private HttpCodeService codeService;

    @GetMapping("/all")
    public ResponseEntity<List<HttpCode>>  getAll(){
        return new ResponseEntity<>(codeService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{httpCode}")
    public ResponseEntity<HttpCode> getByCode(@PathVariable("httpCode") int httpCode){
        return codeService.getByCode(httpCode)
                .map(code -> new ResponseEntity<>(code, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
