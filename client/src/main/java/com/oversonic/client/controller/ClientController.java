package com.oversonic.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oversonic.client.domain.ClientDTO;
import com.oversonic.client.service.ClientService;

@RestController
@RequestMapping("/client")
@CrossOrigin(origins = "http://localhost:8081")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping("/create")
    public ResponseEntity<String> createCLient(@RequestBody ClientDTO newClient) {
        try {
            clientService.createCLient(newClient);
            String responseMessage = String.format(
                "Cliente criado com sucesso: %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s",
                newClient.getCA15_NOME(),
                newClient.getCA15_DATA(),
                newClient.getCA15_STATUS(),
                newClient.getCA15_CPF(),
                newClient.getCA15_CELULAR(),
                newClient.getCA15_CEP(),
                newClient.getCA15_REGIAO(),
                newClient.getCA15_ENDEREC(),
                newClient.getCA15_NUM(),
                newClient.getCA15_BAIRRO(),
                newClient.getCA15_MUNICP(),
                newClient.getCA15_ESTADO(),
                newClient.getCA15_COMPLEM(),
                newClient.getCA15_ESTILO_MUSIC(),
                newClient.getCA15_TIPO_MIDIA(),
                newClient.getCA15_EMAIL()
            );
            return ResponseEntity.ok(responseMessage);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Erro ao criar cliente: " + e.getMessage());
        }
    }


    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        return ResponseEntity.status(500).body("Erro interno: " + e.getMessage());
    }
}
