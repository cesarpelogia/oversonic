<template>
  <div>
    <header>
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
      <p>
        Qual o seu CPF?
      </p>
    </header>
    <main>
      <form @submit.prevent="enviarCpf">
        <div class="form-container">
          <div class="form-row">
            <div class="form-group">
              <label for="cpf">CPF:</label>
              <input type="text" id="cpf" v-model="cpf" />
            </div>
          </div>
          <div style="text-align: center;">
            <button type="submit">Enviar</button>
          </div>
        </div>
      </form>
    </main>
  </div>
</template>

<script>
export default {
  data() {
    return {
      cpf: ''
    };
  },
  methods: {
    enviarCpf() {
      // Lógica para enviar o CPF
      console.log('CPF enviado:', this.cpf);
    }
  }
};
</script>

<style scoped>
/* Importa o CSS global */
@import "@/styles/main.css";

/* Importa o CSS específico do cliente */
@import "@/styles/copyright.css";

body {
  font-family: 'Roboto', Arial, sans-serif;
  margin: 0;
  padding: 0;
  background: linear-gradient(135deg, #0C1A30, #1B395B);
  color: #FFFFFF;
  display: flex;
  flex-direction: column;
  min-height: 100vh; /* Garante que o body ocupe toda a altura da janela */
}

header {
  text-align: center;
  margin-bottom: 20px;
  background-color: #0C1A30; /* Azul Escuro */
  padding: 20px;
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.3);
  flex-shrink: 0; /* Não encolher */
}

header h1 {
  margin: 10px 0;
  font-size: 28px;
  color: #FFFFFF;
  text-transform: uppercase;
  letter-spacing: 2px;
}

header p {
  color: #00A3E0;
  font-size: 18px;
}

main {
  flex: 1; /* Ocupa o espaço disponível */
  display: flex;
  justify-content: center; /* Centraliza horizontalmente */
  align-items: center; /* Centraliza verticalmente */
  padding: 20px;
}

form {
  background-color: #1B395B;
  padding: 20px;
  border-radius: 12px;
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.3);
  max-width: 800px;
  width: 100%;
  color: #FFFFFF;
}

.form-container {
  display: flex;
  flex-direction: column;
}

.form-row {
  display: flex;
  justify-content: space-between; /* Espaço entre os elementos */
  margin-bottom: 10px;
}

.form-row label {
  margin-bottom: 5px; /* Espaço entre o label e o input */
  color: #FFFFFF;
  text-align: left; /* Alinha os labels à esquerda */
}

.form-group {
  flex: 1;
  margin-right: 10px;
}

.form-group.left,
.form-group.right {
  text-align: left; /* Alinha os labels e inputs à esquerda */
}

.form-row input[type="text"],
.form-row input[type="email"],
.form-row select {
  width: 100%; /* Ocupa toda a largura disponível dentro da coluna */
  padding: 8px;
  border: 1px solid #CCCCCC;
  border-radius: 4px;
  box-sizing: border-box;
  background-color: #FFFFFF;
  color: #0C1A30;
}

button[type="submit"] {
  padding: 10px 20px;
  font-size: 16px;
  background-color: #00A3E0;
  color: #FFFFFF;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  margin-top: 20px;
}

button[type="submit"]:hover {
  background-color: #1B395B;
}
</style>