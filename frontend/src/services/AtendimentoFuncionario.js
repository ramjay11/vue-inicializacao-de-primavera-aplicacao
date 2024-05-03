import axios from "axios";

const FUNCIONARIO_BASE_URL = "http://localhost:8088/api/funcionario";

class AtendimentoFuncionario {
    // getFuncionario() {
    //     return axios.get(FUNCIONARIO_BASE_URL);
    // }
    async getFuncionarios() {
        try {
            const response = await axios.get(FUNCIONARIO_BASE_URL);
            return response.data;
        } catch (error) {
            // Handle error
            console.error("Error fetching funcionarios:", error);
            throw error;
        }
    }
}

// Export object of this class
export default new AtendimentoFuncionario()