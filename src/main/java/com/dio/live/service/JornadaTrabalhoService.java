package com.dio.live.service;

import com.dio.live.repository.JornadaTrabalhoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class JornadaTrabalhoService {

    //@Autowired
    JornadaTrabalhoRepository jornadaTrabalhoRepository;

    @Autowired
    public JornadaTrabalhoService(JornadaTrabalhoRepository jornadaTrabalhoRepository){
        this.jornadaTrabalhoRepository = jornadaTrabalhoRepository;
    }
    
}
