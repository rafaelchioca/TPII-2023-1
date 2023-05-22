package ex08;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //f. Escreva cenários de composição de Funcionário para teste e demonstração das capacidades da classe.

        Funcionario f1 = new Funcionario("Rafael", "Chioca", 2000.0);
        f1.setNome("Fábio");
        f1.setSobrenome("Medeiros");
        System.out.println(f1.getNome() + " " + f1.getSobrenome() + ", Salário: " + f1.getSalarioMensal());

        Funcionario f2 = new Funcionario("José", "Silva", -1800.0);
        System.out.println(f2.getNome() + " " + f2.getSobrenome() + ", Salário: " + f2.getSalarioMensal());

        f2.setNome("Pedro");
        f2.setSobrenome("Pascal");
        System.out.println(f2.getNome() + " " + f2.getSobrenome() + ", Salário: " + f2.getSalarioMensal());

        f1.aumentarSalario(10.0);
        System.out.println(f1.getNome() + " " + f1.getSobrenome() + ", Salário: " + f1.getSalarioMensal());

        // h. Calcule o valor total da folha de pagamento;
        double totalFolhaPagamento = f1.getSalarioMensal() + f2.getSalarioMensal();
        System.out.printf("Valor total: R$ %.2f\n", totalFolhaPagamento);

        // i. Crie uma lista de 10 empregados e exiba-os em modo tabular (lista tabulada);

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Olivio", "Santos", 1800.0));
        funcionarios.add(new Funcionario("Alfredo", "Silva", 2500.0));
        funcionarios.add(new Funcionario("Marcia", "Pereira", 3100.0));
        funcionarios.add(new Funcionario("Carla", "Costa", 1900.0));
        funcionarios.add(new Funcionario("Mateus", "Parker", 4800.0));
        funcionarios.add(new Funcionario("Marta", "Junior", 1950.0));
        funcionarios.add(new Funcionario("Priscila", "Switch", 2200.0));
        funcionarios.add(new Funcionario("Maria", "Gates", 2800.0));
        funcionarios.add(new Funcionario("Patricio", "Martins", 6900.0));
        funcionarios.add(new Funcionario("Regina", "Freitas", 10470.0));

        System.out.printf("\n%-10s %-10s %-10s\n", "Nome", "Sobrenome", "Salário");
        for (Funcionario f : funcionarios) {
            System.out.printf("%-10s %-10s %-10.2f\n", f.getNome(), f.getSobrenome(), f.getSalarioMensal());
        }

        // h. Calcule o valor total da folha de pagamento;
        double totalFolhaPagamentoAnterior = totalFolhaPagamento;
        totalFolhaPagamento = 0.0;
        for (Funcionario f : funcionarios) {
            totalFolhaPagamento += f.getSalarioMensal();
        }
        System.out.printf("Valor total: R$ %.2f\n", totalFolhaPagamento);

        // j. Aplique reajuste de salários variados aos 10 funcionários que variam entre 5 e 25% e mostre a lista novamente;
        Random rand = new Random();
        for (Funcionario f : funcionarios) {
            f.aumentarSalario(rand.nextDouble((21) + 5));
        }

        System.out.printf("\n%-10s %-10s %-10s\n", "Nome", "Sobrenome", "Salário");
        for (Funcionario f : funcionarios) {
            System.out.printf("%-10s %-10s %-10.2f\n", f.getNome(), f.getSobrenome(), f.getSalarioMensal());
        }

        totalFolhaPagamentoAnterior = totalFolhaPagamento;
        totalFolhaPagamento = 0.0;
        for (Funcionario f : funcionarios) {
            totalFolhaPagamento += f.getSalarioMensal();
        }

        // k. Calcule o valor total da folha de pagamento e quanto este aumento representa em termos percentuais.
        System.out.printf("Valor total: R$ %.2f\n", totalFolhaPagamento);

        double aumentoPercentual = ((totalFolhaPagamento - totalFolhaPagamentoAnterior) / totalFolhaPagamentoAnterior * 100.0);

        System.out.printf("\nAumento percentual da Folha de Pagamento: %.2f%%\n", aumentoPercentual);
    }
}
