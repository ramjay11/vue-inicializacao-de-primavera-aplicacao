<template>
    <!-- List of Funcionarios-->
    <div class="container">
        <h1 class="text-center">Lista de empregados</h1>
        <!--<div v-if="funcionarios.length === 0" class="text-center">Carregando...</div>-->
        <div v-if="funcionarios.length === 0" class="text-center">Carregando...</div>
        <table class="table table-striped">
            <thead>
                <th>ID do Empregado</th>
                <th>Nome do funcionário</th>
                <th>Sobrenome do funcionário</th>
                <th>E-mail do funcionário</th>
            </thead>
            <tbody>
                <tr v-for="funcionario in funcionarios" :key="funcionario.id">
                <!--<tr v-for="(funcionario, index) in funcionarios" :key="index">-->
                    <td>{{ funcionario.id }}</td>
                    <td>{{ funcionario.primeiroNome }}</td>
                    <td>{{ funcionario.sobrenome }}</td>
                    <td>{{ funcionario.email }}</td>     
                </tr>
            </tbody>
        </table>
    </div>
</template>

<script>
import AtendimentoFuncionario from '@/services/AtendimentoFuncionario';


    export default {
        name: 'FuncionarioList',
        data() {
            return {
            funcionarios: [] // Define funcionarios as an empty array
        };
        },
        methods: {
            async getFuncionarios() {
        try {
            const response = await AtendimentoFuncionario.getFuncionarios();
            console.log("Response data:", response.data); // Log response data
            this.funcionarios = response.data;
            console.log("Funcionarios:", this.funcionarios); // Log funcionarios array
        } catch (error) {
            console.error("Error fetching funcionarios:", error); // Log error
        }
    }
        },
        created() {
            this.getFuncionarios(); // Call getFuncionarios method when component is created
        }
    }
</script>
