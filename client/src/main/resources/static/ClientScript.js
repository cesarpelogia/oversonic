document.addEventListener('DOMContentLoaded', function() {
    const form = document.querySelector('form');
    const submitButton = form.querySelector('button[type="submit"]');
    const fields = form.querySelectorAll('input, select');
    const resultadoDiv = document.getElementById('resultado');

    submitButton.addEventListener('click', function(event) {
        event.preventDefault();
        let isValid = true;
        const formData = {};

        // Limpar mensagens de erro anteriores
        fields.forEach(field => {
            const errorMessage = field.nextElementSibling;
            if (errorMessage && errorMessage.classList.contains('error-message')) {
                errorMessage.remove();
            }
        });

        // Validar campos e coletar dados
        fields.forEach(field => {
            if (!field.value) {
                isValid = false;
                const message = field.tagName === 'SELECT' ? 'Por favor, escolha uma opção.' : 'Por favor, preencha este campo.';
                const errorElement = document.createElement('div');
                errorElement.classList.add('error-message');
                errorElement.style.color = 'red';
                errorElement.textContent = message;
                field.insertAdjacentElement('afterend', errorElement);
            } else {
                formData[field.name] = field.value;
            }
        });

        if (isValid) {
            // Exibir dados na tela
            resultadoDiv.innerHTML = ''; // Limpar conteúdo anterior
            for (const key in formData) {
                const p = document.createElement('p');
                p.textContent = `${key}: ${formData[key]}`;
                resultadoDiv.appendChild(p);
            }
            console.log('Form Data:', formData);

            // Chamar a função para enviar os dados ao servidor
            enviarDadosFormulario(formData);
        }
    });

    /**
     * Função para enviar os dados do formulário para o endpoint "/client/create".
     * @param {Object} formData - Os dados do formulário a serem enviados.
     */
    async function enviarDadosFormulario_(formData) {
        try {
            const response = await fetch('http://localhost:3030/client/create', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(formData)
            });

            if (response.ok) {
                const result = await response.json();
                resultadoDiv.innerHTML = 'Dados enviados com sucesso!';
                console.log('Resposta do servidor:', result);
            } else {
                resultadoDiv.innerHTML = 'Erro ao enviar os dados.';
                console.error('Erro na resposta do servidor:', response.statusText);
            }
        } catch (error) {
            resultadoDiv.innerHTML = 'Erro ao enviar os dados.';
            console.error('Erro na requisição:', error);
        }
    }

    function enviarDadosAxios() {
        const dados = {
            "nome": "Carlos Pereira",
            "genero": "Masculino",
            "cpf": "987.654.321-00",
            "celular": "(11) 99876-5432",
            "cep": "87654-321",
            "regiao": "Sul",
            "endereco": "Rua das Flores",
            "numero": "5678",
            "bairro": "Jardim",
            "municipio": "São Paulo",
            "estado": "SP",
            "complemento": "Casa 2",
            "estilo": "Jazz",
            "midia": "Vinil",
            "email": "carlos.pereira@example.com"
        }
        enviarDadosFormulario(dados)
    }

    async function enviarDadosFormulario(formData) {
        try {
            const response = await axios.post('http://localhost:3030/client/create', formData, {
                headers: {
                    'Content-Type': 'application/json'
                }
            });
    
            // Supondo que você tenha um elemento no DOM para mostrar o resultado
            resultadoDiv.innerHTML = 'Dados enviados com sucesso!';
            console.log('Resposta do servidor:', response.data);
        } catch (error) {
            // Supondo que você tenha um elemento no DOM para mostrar o resultado
            resultadoDiv.innerHTML = 'Erro ao enviar os dados.';
            console.error('Erro na requisição:', error);
        }
    }
});