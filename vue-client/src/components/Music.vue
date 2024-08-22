<template>
  <div class="container">
    <header>
      <img src="Logo para html.png" alt="Logotipo Oversonic" class="logo">
    </header>
    <form id="cadastroISRCePlataformas" action="URL_DO_SERVIDOR" method="POST" enctype="multipart/form-data">
      <div id="musicaContainer" class="container">
        <h1>Música</h1>
        <label for="nomeMusica">Nome da Música: </label>
        <input type="text" id="nomeMusica" name="nomeMusica"><br>

        <label for="estiloMusical">Estilo Musical: </label>
        <select id="estiloMusical" name="estiloMusical">
          <option value="" disabled selected>Escolha um estilo</option>
          <option value="Black Music">Black Music</option>
          <option value="Blues/Jazz">Blues/Jazz</option>
          <option value="Forró eletrônico">Forró eletrônico</option>
          <option value="Forró pé de serra/Xote">Forró pé de serra/Xote</option>
          <option value="Funk">Funk</option>
          <option value="Gospel">Gospel</option>
          <option value="Hard Rock/Metal">Hard Rock/Metal</option>
          <option value="MPB">MPB</option>
          <option value="Piseiro">Piseiro</option>
          <option value="Pop">Pop</option>
          <option value="Pop Rock">Pop Rock</option>
          <option value="Rap">Rap</option>
          <option value="Reggae">Reggae</option>
          <option value="Rock Alternativo">Rock Alternativo</option>
          <option value="Samba/Pagode">Samba/Pagode</option>
          <option value="Sertanejo">Sertanejo</option>
          <option value="Trap">Trap</option>
          <option value="Outro estilo">Outro estilo</option>
        </select><br>
      </div>

      <div id="cantoresContainer" class="container">
        <h1>Cantor</h1>
        <label for="nomeCompletoCantor">Nome Completo Cantor (a): </label>
        <input type="text" id="nomeCompletoCantor" name="nomeCompletoCantor"><br>

        <label for="nomeArtisticoCantor">Nome Artístico Cantor: </label>
        <input type="text" id="nomeArtisticoCantor" name="nomeArtisticoCantor"><br>
        
        <label for="CPFCantor">CPF Cantor: </label>
        <input type="text" id="CPFCantor" name="CPFCantor"><br><br>
      </div>

      <button type="button" @click="adicionarCantor">Adicionar mais um cantor</button><br>

      <div id="compositoresContainer" class="container">
        <h1>Compositor</h1>
        <label for="compositorNomeCompleto">Nome Completo Compositor: </label>
        <input type="text" id="compositorNomeCompleto" name="compositorNomeCompleto"><br>

        <label for="compositorNomeArtistico">Nome Artístico Compositor: </label>
        <input type="text" id="compositorNomeArtistico" name="compositorNomeArtistico"><br>

        <label for="compositorCPF">CPF Compositor: </label>
        <input type="text" id="compositorCPF" name="compositorCPF"><br>
      </div>

      <button type="button" @click="adicionarCompositor">Adicionar mais um Compositor</button><br>

      <div id="capaContainer" class="container">
        <h1>Imagem de Capa</h1>
        <h4>* A imagem de capa será a imagem que aparecerá nas plataformas. Essa imagem pode ser uma foto ou uma imagem costumizada. É muito importante que essa imagem tenha uma boa qualidade.</h4>
        <label for="imagemCapa">Imagem de Capa: </label>
        <input type="file" id="imagemCapa" name="imagemCapa" accept="image/*" @change="previewImagem"><br><br>
        <img id="previewImagemCapa" :src="imagemCapaSrc" alt="Pré-visualização da Imagem de Capa" v-if="imagemCapaSrc" style="max-width: 50%; height: auto; object-fit: contain;"><br><br>
        <input type="submit" value="Carregar de Capa">
      </div>

      <input type="submit" value="Enviar Todas as Informações e Foto">
    </form>
  </div>
</template>

<script>
export default {
  name: 'CadastroISRCePlataformas',
  data() {
    return {
      musica: {
        nomeMusica: '',
        estiloMusica: ''
      },
      cantores: [],
      novoCantor: {
        nomeCompleto: '',
        nomeArtistico: '',
        cpf: ''
      },
      compositores: [],
      novoCompositor: {
        nomeCompleto: '',
        nomeArtistico: '',
        cpf: ''
      },
      showConfirmPopup: false
    };
  },
  methods: {
    adicionarCantor() {
      this.cantores.push({ ...this.novoCantor });
      this.novoCantor = {
        nomeCompleto: '',
        nomeArtistico: '',
        cpf: ''
      };
    },
    removerCantor(index) {
      this.cantores.splice(index, 1);
    },
    adicionarCompositor() {
      this.compositores.push({ ...this.novoCompositor });
      this.novoCompositor = {
        nomeCompleto: '',
        nomeArtistico: '',
        cpf: ''
      };
    },
    removerCompositor(index) {
      this.compositores.splice(index, 1);
    },
    confirmarEnvio() {
      this.showConfirmPopup = true;
    },
    enviarDados() {
      const dados = {
        musica: this.musica,
        cantores: this.cantores,
        compositores: this.compositores
      };

      fetch('', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json'
        },
        body: JSON.stringify(dados)
      })
      .then(response => response.json())
      .then(data => {
        console.log('Success:', data);
        this.showConfirmPopup = false;
      })
      .catch((error) => {
        console.error('Error:', error);
      });
    }
  }
}
</script>

<style scoped>
.container {
  margin: 20px;
}
.logo {
  max-width: 100px;
}
h1 {
  font-size: 24px;
  margin-bottom: 10px;
}
label {
  display: block;
  margin-top: 10px;
}
input[type="text"], input[type="file"], select {
  width: 100%;
  padding: 8px;
  margin-top: 5px;
}
button {
  margin-top: 10px;
  padding: 10px 20px;
  background-color: #42b983;
  color: white;
  border: none;
  cursor: pointer;
}
button:hover {
  background-color: #369f6e;
}
</style>