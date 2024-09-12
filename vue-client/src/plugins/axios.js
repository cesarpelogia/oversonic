// src/plugins/axios.js
import axios from 'axios';

const apiClient = axios.create({
    baseURL: process.env.VUE_APP_API_URL || 'http://localhost:8080/api',
    headers: {
        'Content-Type': 'application/json'
    }
});

// Função para enviar dados para o endpoint /create-client
export const createClient = async (newCLient) => {
    try {
        const response = await apiClient.post('/create-client', newCLient);
        return response.data;
    } catch (error) {
        console.error('Erro ao enviar dados:', error);
        throw error;
    }
};

export const findByCpf = async (cpf) => {
    try {
        const response = await apiClient.get(`/find-cpf/${cpf}`);
        return response.data;
    } catch (error) {
        console.error('Erro ao buscar CPF:', error);
        throw error;
    }
};

export default apiClient;