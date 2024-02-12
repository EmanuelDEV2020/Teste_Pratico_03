package Teste03;
import java.util.ArrayList;
import java.util.List;



public class Funcionario {

    private String nome;
    private String cargo;
    private String dataContratacao;

    // Construtor
    public Funcionario(String nome, String cargo, String dataContratacao) {
        this.nome = nome;
        this.cargo = cargo;
        this.dataContratacao = dataContratacao;
    }

    // Método para calcular o valor do benefício
    public double calcularBeneficio() {
        switch (cargo) {
            case "Secretário":
                return 1000.0; // Valor fixo do benefício para Secretário
            case "Vendedor":
                return 1800.0; // Valor fixo do benefício para Vendedor
            default:
                return 0.0; // Não há benefício para outros cargos
        }
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }
}

