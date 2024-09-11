import CreateClient from '@/components/CreateClient.vue';
import CreateCopyright from '@/components/CreateCopyright.vue';
import { createRouter, createWebHistory } from 'vue-router';

const routes = [
  {
    path: '/create-client',
    name: 'CreateClient',
    component: CreateClient
  },
  {
    path: '/create-copyright',
    name: 'CreateCopyright',
    component: CreateCopyright
  }
];

const router = createRouter({
  history: createWebHistory(),
  routes
});

export default router;