package com.oversonic.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oversonic.client.domain.MusicDTO;
import com.oversonic.client.service.MusicService;

@RestController
@RequestMapping("/client")
@CrossOrigin(origins = "http://localhost:8081")
public class MusicController {
    
    @Autowired
    private MusicService musicService;

        @PostMapping("/music")
    public ResponseEntity<String> createMusic(@RequestBody MusicDTO newMusic) {
        try {
            musicService.createMusic (newMusic);
            String responseMessage = String.format(
                "Musica criada com sucesso: %s, %s, %s,%s",
                newMusic.getNomeMusica(),
                newMusic.getEstiloMusica(),
                String.join(", ", newMusic.getCantores()),
                String.join (", ", newMusic.getCompositores())
                );
                return ResponseEntity.ok(responseMessage);
        } catch (Exception e){
            return ResponseEntity.status(500).body("Erro ao criar musica: " + e.getMessage());
        }
    }

        @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        return ResponseEntity.status(500).body("Erro interno: " + e.getMessage());
    }
}
