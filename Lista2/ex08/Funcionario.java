package ex08;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    // a. Características: um primeiro nome, um sobrenome, um salário mensal.
    private String nome;
    private String sobrenome;
    private Double salarioMensal;

    // b. Faça a inicialização dos atributos por meio de um construtor.
    public Funcionario(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.setSalarioMensal(salarioMensal);
    }

    // c. Crie métodos de acesso para a consulta dos atributos;
    // d. Apenas os atributos correlatos a Nome e Sobrenome poderão ser modificados;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Double getSalarioMensal() {
        return salarioMensal;
    }

    // e. Se o salário mensal não for positivo, configure-o como 0.0.
    private void setSalarioMensal(double salarioMensal) {
        if (salarioMensal <= 0.0) {
            this.salarioMensal = 0.0;
        } else {
            this.salarioMensal = salarioMensal;
        }
    }

    // g. Crie uma função na classe que seja responsável por realizar o aumento de salário, esta função deverá receber
    // apenas o valor numérico relativo ao % de aumento e aplicá-los sobre o valor;
    public void aumentarSalario(double porcentagemAumento) {
        double aumento = this.salarioMensal * (porcentagemAumento / 100.0);
        this.salarioMensal += aumento;
    }
}