import CreateClient from '@/views/CreateClient.vue';
import CreateCopyright from '@/views/CreateCopyright.vue';
import HomePage from '@/views/Home.vue';
import { createRouter, createWebHistory } from 'vue-router';

const routes = [
    { path: '/', name: 'Home', component: HomePage },
    { path: '/create-client', name: 'CreateClient', component: CreateClient },
    { path: '/create-copyright', name: 'CreateCopyright', component: CreateCopyright }
];

const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes
});

export default router;