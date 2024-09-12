<template>
    <div>
        <main>
        <div class="form-container">
        <h2>Acesse sua conta</h2>
            <form @submit.prevent="verificarCpf">
            <div class="form-group">
                <label for="cpf">CPF:</label>
                <input type="text" id="cpf" v-model="cpf" required>
                <br><br>
                <label for="senha">4 últimos números do celular:</label>
                <input type="text" id="senha" v-model="senha" required>
                <br>
            </div>
                <button type="submit">Verificar</button>
            </form>
                <div class="createClient">
                    <h2>Ainda não tem cadastro?</h2>
                    <router-link to="/create-client" class="">Realizar Cadastro</router-link>
                </div>
            </div>
        </main>
    <Footer />
    </div>
</template>

<script>
import Footer from '@/components/Footer.vue';
import '@/styles/home.css';

export default {
    name: 'HomePage',
    components: {
    Footer
    },
    data() {
    return {
        cpf: '',
        senha: '',
        erro: ''
    };
    },
    // methods: {
    //     async verificarCpf() {
    //         try {
    //             const response = await axios.get('/', {
    //                 params: {
    //                     cpf: this.cpf,
    //                     senha: this.senha
    //                 }
    //             });
    //             if (response.data.valido) {
    //                 this.$router.push('/create-copyright');
    //             } else {
    //                 this.erro = 'CPF ou senha incorretos';
    //             }
    //         } catch (error) {
    //             console.error('Erro ao verificar o cpf: ', error);
    //             this.erro = 'Ocorreu um erro ao verificar o CPF. Tente novamente mais tarde.';
    //         }
    //     }
    // }
};

</script>

<style>
@import '../styles/home.css';
</style>