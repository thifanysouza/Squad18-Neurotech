package com.api.neurotechMed_iD.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.neurotechMed_iD.repositories.HospitalRepository;
import com.api.neurotechMed_iD.models.*;
import antlr.collections.List;

@RestController
@RequestMapping(value="/controllers")

public class HospitalController {
    @Autowired
    HospitalRepository hospitalRepository;

    /**
     * @return
     */
    @GetMapping("/hospitais")
    public List<Hospital> listaHospitais(){ //Cria uma lista de hospitais e retorna
        return hospitalRepository.findAll();
    }
        
}
