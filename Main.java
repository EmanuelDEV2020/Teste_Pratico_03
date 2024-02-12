package Teste03;
import java.util.ArrayList;
import java.util.List;



public class Main {
    // Método para calcular o total pago em benefícios no mês para os funcionários que recebem benefícios
    public static double calcularTotalBeneficios(List<Funcionario> funcionarios, String mesAno) {
        double totalBeneficios = 0.0;

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.calcularBeneficio() > 0 && funcionario.getDataContratacao().endsWith(mesAno)) {
                totalBeneficios += funcionario.calcularBeneficio();
            }
        }

        return totalBeneficios;
    }

    public static void main(String[] args) {
        // Criar lista de funcionários
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Jorge Carvalho", "Secretário", "01/2018"));
        funcionarios.add(new Funcionario("Maria Souza", "Secretário", "12/2015"));
        funcionarios.add(new Funcionario("Ana Silva", "Vendedor", "12/2021"));
        funcionarios.add(new Funcionario("João Mendes", "Vendedor", "12/2021"));
        funcionarios.add(new Funcionario("Juliana Alves", "Gerente", "07/2017"));
        funcionarios.add(new Funcionario("Bento Albino", "Gerente", "03/2014"));

        // Calcular o total pago em benefícios no mês
        String mesAno = "12/2021"; // Definir o mês e ano desejado
        double totalBeneficios = calcularTotalBeneficios(funcionarios, mesAno);

        // Exibir o total pago em benefícios no mês
        System.out.println("Total pago em benefícios no mês " + mesAno + ": R$ " + totalBeneficios);
    }
}