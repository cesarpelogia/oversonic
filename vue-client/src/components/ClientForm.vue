<template>
  <div>
    <header>
      <!-- Use require para importar imagens estáticas no Vue -->
      <img :src="require('@/assets/Capa Oversonic #1.png')" alt="Imagem do Cabeçalho" />
      <h1>Cadastro de Clientes Oversonic</h1>
      <p>Este é um formulário de cadastro de Clientes Oversonic. Por favor, preencha todas as informações necessárias.</p>
    </header>
    <div>
      <!-- Previne o comportamento padrão do formulário -->
      <form @submit.prevent="enviarDadosAxios">
        <div class="form-container">
          <div class="form-column">
            <!-- Campos do formulário com v-model para vinculação bidirecional -->
            <label for="nome">Nome:</label>
            <input type="text" id="nome" v-model="nome" />

            <label for="endereco">Endereço:</label>
            <input type="text" id="endereco" v-model="endereco" />

            <label for="complemento">Complemento:</label>
            <input type="text" id="complemento" v-model="complemento" />

            <label for="municipio">Município:</label>
            <input type="text" id="municipio" v-model="municipio" />

            <label for="estado">Estado:</label>
            <select id="estado" v-model="estado">
              <option value="">Escolha um</option>
              <option value="AC">Acre</option>
              <option value="AL">Alagoas</option>
              <option value="AP">Amapá</option>
              <!-- Adicione outras opções conforme necessário -->
            </select>

            <label for="genero">Gênero:</label>
            <select id="genero" v-model="genero">
              <option value="">Escolha um</option>
              <option value="Feminino">Feminino</option>
              <option value="Masculino">Masculino</option>
              <option value="Outros">Outros</option>
              <option value="Prefiro não informar">Prefiro não informar</option>
            </select>

            <label for="email">Email:</label>
            <input type="email" id="email" v-model="email" />

            <label for="tipo_midia">Tipo de Mídia:</label>
            <select id="tipo_midia" v-model="tipo_midia">
              <option value="">Escolha um</option>
              <option value="Instagram">Instagram</option>
              <option value="Facebook">Facebook</option>
              <option value="Google">Google</option>
              <!-- Adicione outras opções conforme necessário -->
            </select>
          </div>
          <div class="form-column">
            <!-- Campos adicionais -->
            <label for="cpf">CPF:</label>
            <input type="text" id="cpf" v-model="cpf" />

            <label for="num">Número:</label>
            <input type="text" id="num" v-model="num" />

            <label for="bairro">Bairro:</label>
            <input type="text" id="bairro" v-model="bairro" />

            <label for="cep">CEP:</label>
            <input type="text" id="cep" v-model="cep" />

            <label for="regiao">Região:</label>
            <select id="regiao" v-model="regiao">
              <option value="">Escolha um</option>
              <option value="Centro-Oeste">Centro-Oeste</option>
              <option value="Nordeste">Nordeste</option>
              <!-- Adicione outras opções conforme necessário -->
            </select>

            <label for="celular">Celular:</label>
            <input type="text" id="celular" v-model="celular" />

            <label for="estilo_musical">Estilo Musical:</label>
            <select id="estilo_musical" v-model="estilo_musical">
              <option value="">Escolha um</option>
              <option value="Black Music">Black Music</option>
              <option value="Blues/Jazz">Blues/Jazz</option>
              <!-- Adicione outras opções conforme necessário -->
            </select>
          </div>
        </div>
        <div style="text-align: center;">
          <button type="submit">Enviar</button>
        </div>
      </form>
    </div>
    <div v-if="resultado">
      <p>{{ resultado }}</p>
    </div>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      nome: '',
      endereco: '',
      complemento: '',
      municipio: '',
      estado: '',
      genero: '',
      email: '',
      tipo_midia: '',
      cpf: '',
      num: '',
      bairro: '',
      cep: '',
      regiao: '',
      celular: '',
      estilo_musical: '',
      resultado: ''  // Adiciona uma variável para armazenar a resposta do servidor
    };
  },
  methods: {
    async enviarDadosAxios() {
      try {
        // Envia os dados do formulário para o backend
        await axios.post('http://localhost:8080/client/create', {  // Alterado para a porta 8081 e endpoint correto
          nome: this.nome,
          endereco: this.endereco,
          complemento: this.complemento,
          municipio: this.municipio,
          estado: this.estado,
          genero: this.genero,
          email: this.email,
          tipo_midia: this.tipo_midia,
          cpf: this.cpf,
          num: this.num,
          bairro: this.bairro,
          cep: this.cep,
          regiao: this.regiao,
          celular: this.celular,
          estilo_musical: this.estilo_musical
        });
        this.resultado = 'Dados enviados com sucesso!';  // Atualiza a variável de resultado
      } catch (error) {
        console.error('Erro ao enviar dados:', error);
        this.resultado = 'Erro ao enviar dados.';  // Atualiza a variável de resultado em caso de erro
      }
    }
  }
};
</script>

<style scoped>
/* Importa o CSS global a partir da pasta assets */
@import "@/assets/ClientStyle.css";
</style>