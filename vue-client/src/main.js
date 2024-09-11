import { createApp } from 'vue';
import App from './App.vue';
import apiClient from './plugins/axios';

// Crie a aplicação com `createApp`:
const app = createApp(App);

// Configure Axios globalmente (se necessário):
app.config.globalProperties.$http = apiClient;

// Monte a aplicação:
app.mount('#app');
