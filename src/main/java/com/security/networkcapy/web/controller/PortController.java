package com.security.networkcapy.web.controller;

import com.security.networkcapy.domain.service.PortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.sampled.Port;
import java.util.List;

@RestController
@RequestMapping("/ports")
public class PortController {

    @Autowired
    private PortService portService;


    @GetMapping("/all")
    public ResponseEntity<List<Port>> getAll(){
        return new ResponseEntity(portService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{port}")
    public ResponseEntity<Port> getByPort(@PathVariable("port") int portId){
        return portService.getByPort(portId)
                .map(port -> new ResponseEntity(port, HttpStatus.OK))
                .orElse(new ResponseEntity(HttpStatus.NOT_FOUND));
    }

}
