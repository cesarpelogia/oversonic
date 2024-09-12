<template>
  <div class="form-container-copyright">
    <div class="cabecalho">
      <h1>Bem-vindo(a) ao Cadastro de Músicas!</h1>
      <p>
        Os dados serão usados para o registro do ISRC e o lançamento nas plataformas digitais. Cada música terá um ISRC único, que funciona como a identidade da gravação e permite que sua música seja identificada em plataformas como Spotify e Apple Music.
      </p>
      <p>
        Se você tem mais de uma música, vamos cadastrar uma por vez. Após completar o cadastro, retorne a esta página, insira seu CPF novamente e cadastre a próxima música.
      </p>
      <p>
        Preencha todos os campos corretamente, especialmente o nome da música, dos compositores e cantores, verificando a grafia e acentos.
      </p>
    </div>
    <div class="form-wrapper">
      <form @submit.prevent="verificarCpf">
        <div class="form-group">
          <label for="cpf">CPF:</label>
          <input type="text" id="cpf" v-model="cpf" required>
        </div>
        <button type="submit">Buscar</button>
      </form>
    </div>
  </div>
</template>

<script>
import { findByCpf } from '@/plugins/axios';

export default {
  data() {
    return {
      cpf: '',
      resultado: ''
    };
  },
  methods: {
    async verificarCpf() {
      try {
        const response = await buscarCpf(this.cpf);
        this.resultado = response;
      } catch (error) {
        console.error('Erro ao buscar CPF:', error);
        this.resultado = 'Erro ao buscar CPF.';
      }
    }
  }
};
</script>

<style scoped>

@import '../styles/main.css';
@import '../styles/copyright.css';

</style>