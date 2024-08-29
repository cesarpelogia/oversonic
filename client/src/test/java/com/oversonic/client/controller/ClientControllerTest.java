package com.oversonic.client.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.oversonic.client.domain.ClientDTO;
import com.oversonic.client.service.ClientService;

@WebMvcTest(ClientController.class)
public class ClientControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ClientService clientService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testCreateClient() throws Exception {
        // Obtenha a data atual
        LocalDate currentDate = LocalDate.now();

        // Crie o objeto ClientDTO com dados de teste
        ClientDTO newClient = new ClientDTO();
        newClient.setCA15_NOME("Nome Teste");
        newClient.setCA15_DATA(currentDate.toString());
        newClient.setCA15_STATUS("Ativo");
        newClient.setCA15_CPF("12345678901");
        newClient.setCA15_CELULAR("11999999999");
        newClient.setCA15_CEP("12345000");
        newClient.setCA15_REGIAO("Sudeste");
        newClient.setCA15_ENDEREC("Rua Teste");
        newClient.setCA15_NUM("123");
        newClient.setCA15_BAIRRO("Bairro Teste");
        newClient.setCA15_MUNICP("Cidade Teste");
        newClient.setCA15_ESTADO("SP");
        newClient.setCA15_COMPLEM("Complemento Teste");
        newClient.setCA15_ESTILO_MUSIC("Rock");
        newClient.setCA15_TIPO_MIDIA("CD");
        newClient.setCA15_EMAIL("email@teste.com");

        // Mock o comportamento do serviço para não fazer nada quando createClient é chamado
        Mockito.doNothing().when(clientService).createCLient(Mockito.any(ClientDTO.class));

        // Construir a string esperada dinamicamente com a data atual
        String expectedResponse = String.format(
            "Cliente criado com sucesso: Nome Teste, %s, Ativo, 12345678901, 11999999999, 12345000, Sudeste, Rua Teste, 123, Bairro Teste, Cidade Teste, SP, Complemento Teste, Rock, CD, email@teste.com",
            currentDate.toString()
        );

        // Realize o teste de mockMvc com o conteúdo do cliente e verifique a resposta
        mockMvc.perform(post("/client/create")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(newClient)))
                .andExpect(status().isOk())
                .andExpect(content().string(expectedResponse));  // Use a resposta esperada dinâmica
    }

}

