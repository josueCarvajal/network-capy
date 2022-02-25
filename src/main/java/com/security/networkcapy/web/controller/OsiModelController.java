package com.security.networkcapy.web.controller;

import com.security.networkcapy.domain.service.OsiModelService;
import com.security.networkcapy.persistence.entity.OsiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/osi")
public class OsiModelController {

    @Autowired
    private OsiModelService osiModelService;

    @GetMapping("/all")
    public ResponseEntity<List<OsiModel>> getAll(){
        return new ResponseEntity(osiModelService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{layer_id}")
    public ResponseEntity<OsiModel> getByLayer(@PathVariable("layer_id") int layerId){
        return osiModelService.getByLayer(layerId)
                .map(osiModel -> new ResponseEntity(osiModel,HttpStatus.OK))
                .orElse(new ResponseEntity(HttpStatus.NOT_FOUND));
    }
}
