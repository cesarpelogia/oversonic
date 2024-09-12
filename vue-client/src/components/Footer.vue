<template>
    <footer>
    <p>&copy; 2024 Oversonic Music. Todos os direitos reservados.</p>
    </footer>
</template>

<script>
export default {
    name: 'FooterComponent',
}
</script>

<style scoped>
footer {
    text-align: center;
    padding: 20px;
    background-color: #f1f1f1;
    color: #333;
    flex-shrink: 0; /* Não encolher */
    position: fixed; /* Fixa o footer no final da página */
    bottom: 0;
    width: 100%;
}
</style>