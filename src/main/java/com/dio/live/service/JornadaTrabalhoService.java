package com.dio.live.service;

import java.util.List;
import java.util.Optional;

import com.dio.live.model.JornadaTrabalho;
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
    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho) {
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }
    public List<JornadaTrabalho> findAll() {
        return jornadaTrabalhoRepository.findAll();
    }
    public Optional<JornadaTrabalho> getById(Long id) {
        return Optional.ofNullable(jornadaTrabalhoRepository.getById(id));
    }
    
}
