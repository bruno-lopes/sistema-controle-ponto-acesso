package com.dio.live.controller;

import java.util.List;

import com.dio.live.model.JornadaTrabalho;
import com.dio.live.service.JornadaTrabalhoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {
    
    @Autowired
    JornadaTrabalhoService jornadaTrabalhoService;

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho novaJornadaTrabalho) {
        return jornadaTrabalhoService.saveJornada(novaJornadaTrabalho) ;
    }


    @GetMapping
    public List<JornadaTrabalho> getJornadaList() {
        return jornadaTrabalhoService.findAll();
    }

    // @GetMapping
    public JornadaTrabalho getJornadaById(@RequestParam("id") Long id) throws Exception {
        return jornadaTrabalhoService.getById(id).orElseThrow(() -> new Exception("Jornada não encontrada"));
    }

    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> getJornadaByIdPath(@PathVariable("idJornada") Long idJornada) throws Exception {
        return ResponseEntity.ok(jornadaTrabalhoService.getById(idJornada).orElseThrow(() -> new Exception("Jornada não encontrada")));
    }

    @PutMapping
    public ResponseEntity<JornadaTrabalho> updateJornada(JornadaTrabalho jornadaTrabalho) throws Exception {
        return ResponseEntity.ok(
            jornadaTrabalhoService.updateJornada(
                jornadaTrabalho).orElseThrow(
                    () -> new Exception("Jornada não encontrada")
                ));
    }

    @DeleteMapping("/{idJornada}")
    public void deleteJornada(@PathVariable("idJornada") Long idJornada) {
        jornadaTrabalhoService.deleteJornada(idJornada);
    }
}
