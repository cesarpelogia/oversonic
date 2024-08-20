package com.oversonic.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oversonic.client.domain.ClientDTO;
import com.oversonic.client.repository.ClientRepository;

@Service
public class ClientService {

    @Autowired
    public ClientRepository clientRepository;
    
    public void create(ClientDTO newClient) {
        clientRepository.save(newClient);
    }
}
