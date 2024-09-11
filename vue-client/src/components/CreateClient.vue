<template>
  <div>
    <header>
      <h1>Cadastro de Clientes Oversonic</h1>
      <p>Por favor, preencha o cadastro abaixo com suas informações pessoais e de contato.</p>
      <p>Todos os campos são importantes para que possamos atendê-lo da melhor forma possível.</p>
    </header>
    <main>
      <form @submit.prevent="enviarDadosAxios">
        <div class="form-container">
          <div class="form-row full-width">
            <div class="form-group">
              <label for="nome">Nome Completo:</label>
              <input type="text" id="nome" v-model="nome" />
            </div>
          </div>

          <div class="form-row">
            <div class="form-group left">
              <label for="cpf">CPF:</label>
              <input type="text" id="cpf" v-model="cpf" />
            </div>
            <div class="form-group right">
              <label for="genero">Gênero:</label>
              <select id="genero" v-model="genero">
                <option value="">Escolha um</option>
                <option value="Feminino">Feminino</option>
                <option value="Masculino">Masculino</option>
                <option value="Outros">Outros</option>
                <option value="Prefiro não informar">Prefiro não informar</option>
              </select>
            </div>
          </div>

          <div class="form-row">
            <div class="form-group left">
              <label for="celular">Telefone Celular (com DDD):</label>
              <input type="text" id="celular" v-model="celular" />
            </div>
            <div class="form-group right">
              <label for="email">Endereço de Email:</label>
              <input type="email" id="email" v-model="email" />
            </div>
          </div>

          <div class="form-row">
            <div class="form-group left">
              <label for="estilo_musical">Estilo Musical Preferido:</label>
              <select id="estilo_musical" v-model="estilo_musical">
                <option value="">Escolha um estilo</option>
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
              </select>
            </div>
            <div class="form-group right">
              <label for="tipo_midia">Onde conheceu a Oversonic?</label>
              <select id="tipo_midia" v-model="tipo_midia">
                <option value="">Escolha um</option>
                <option value="Instagram">Instagram</option>
                <option value="Facebook">Facebook</option>
                <option value="Google">Google</option>
                <option value="Tik Tok">Tik Tok</option>
                <option value="Já sou cliente">Já sou cliente</option>
                <option value="Indicação de amigo">Indicação de amigo</option>
                <option value="Outros">Outros</option>
              </select>
            </div>
          </div>

          <div class="form-row">
            <div class="form-group left">
              <label for="rua">Rua:</label>
              <input type="text" id="rua" v-model="rua" />
            </div>
            <div class="form-group right">
              <label for="num">Número:</label>
              <input type="text" id="numero" v-model="num" />
            </div>
          </div>

          <div class="form-row">
            <div class="form-group left">
              <label for="complemento">Complemento:</label>
              <input type="text" id="complemento" v-model="complemento" />
            </div>
            <div class="form-group right">
              <label for="bairro">Bairro:</label>
              <input type="text" id="bairro" v-model="bairro" />
            </div>
          </div>

          <div class="form-row">
            <div class="form-group left">
              <label for="municipio">Cidade:</label>
              <input type="text" id="municipio" v-model="municipio" />
            </div>
            <div class="form-group right">
              <label for="estado">Estado:</label>
              <select id="estado" v-model="estado">
                <option value="">Escolha um</option>
                <option value="AC">Acre</option>
                <option value="AL">Alagoas</option>
                <option value="AP">Amapá</option>
                <option value="AM">Amazonas</option>
                <option value="BA">Bahia</option>
                <option value="CE">Ceará</option>
                <option value="DF">Distrito Federal</option>
                <option value="ES">Espírito Santo</option>
                <option value="GO">Goiás</option>
                <option value="MA">Maranhão</option>
                <option value="MT">Mato Grosso</option>
                <option value="MS">Mato Grosso do Sul</option>
                <option value="MG">Minas Gerais</option>
                <option value="PA">Pará</option>
                <option value="PB">Paraíba</option>
                <option value="PR">Paraná</option>
                <option value="PE">Pernambuco</option>
                <option value="PI">Piauí</option>
                <option value="RJ">Rio de Janeiro</option>
                <option value="RN">Rio Grande do Norte</option>
                <option value="RS">Rio Grande do Sul</option>
                <option value="RO">Rondônia</option>
                <option value="RR">Roraima</option>
                <option value="SC">Santa Catarina</option>
                <option value="SP">São Paulo</option>
                <option value="SE">Sergipe</option>
                <option value="TO">Tocantins</option>
              </select>
            </div>
          </div>

          <div class="form-row">
            <div class="form-group left">
              <label for="cep">CEP:</label>
              <input type="text" id="cep" v-model="cep" />
            </div>
            <div class="form-group right">
              <label for="regiao">Região:</label>
              <select id="regiao" v-model="regiao">
                <option value="">Escolha uma região</option>
                <option value="Centro-Oeste">Centro-Oeste</option>
                <option value="Nordeste">Nordeste</option>
                <option value="Norte">Norte</option>
                <option value="Sudeste">Sudeste</option>
                <option value="Sul">Sul</option>
              </select>
            </div>
          </div>

        </div>
        <div style="text-align: center;">
          <button type="submit">Enviar</button>
        </div>
      </form>
    </main>
    <div v-if="resultado">
      <p>{{ resultado }}</p>
    </div>
    <footer>
      <p>&copy; 2024 Oversonic Music. Todos os direitos reservados.</p>
    </footer>
  </div>
</template>



<script>
import apiClient from '@/plugins/axios';

export default {
  data() {
    return {
      nome: '',
      cpf: '',
      genero: '',
      celular: '',
      email: '',
      estilo_musical: '',
      tipo_midia: '',
      rua: '',
      numero: '',
      complemento: '',
      bairro: '',
      municipio: '',
      estado: '',
      cep: '',
      regiao: '',
      resultado: '',
      dataAtual: new Date().toISOString().split('T')[0]
    };
  },
  methods: {
    async enviarDadosAxios() {
      try {
        await apiClient.post('/create', {
          CA15_NOME: this.nome,
          CA15_CPF: this.cpf,
          CA15_GENERO: this.genero,
          CA15_CELULAR: this.celular,
          CA15_EMAIL: this.email,
          CA15_ESTILO_MUSIC: this.estilo_musical,
          CA15_TIPO_MIDIA: this.tipo_midia,
          CA15_ENDEREC: this.rua,
          CA15_NUM: this.numero,
          CA15_COMPLEM: this.complemento,
          CA15_BAIRRO: this.bairro,
          CA15_MUNICP: this.municipio,
          CA15_ESTADO: this.estado,
          CA15_CEP: this.cep,
          CA15_REGIAO: this.regiao,
          CA15_DATA: this.dataAtual
        });
        this.resultado = 'Dados enviados com sucesso!';
      } catch (error) {
        console.error('Erro ao enviar dados:', error);
        this.resultado = 'Erro ao enviar dados.';
      }
    }
  }
};
</script>

<style scoped>
/* Importa o CSS global */
@import "@/styles/main.css";

/* Importa o CSS específico do cliente */
@import "@/styles/client.css";
</style>