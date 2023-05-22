package br.com.fatec.padroes.factory.exercicio.impl;

import br.com.fatec.padroes.factory.exercicio.EstacionamentoFactory;
import br.com.fatec.padroes.factory.exercicio.Veiculo;
import br.com.fatec.padroes.factory.exercicio.VeiculoEnum;

public class Main {
    public static void main(String[] args) {
        EstacionamentoFactory factory = new EstacionamentoFactory();

        Veiculo v = factory.create(VeiculoEnum.CARRO);

        v.mostrarTipo();

        Veiculo v2 = factory.create(VeiculoEnum.MOTO);
        Veiculo v3 = factory.create(VeiculoEnum.BARCO);

        v2.mostrarTipo();
        v3.mostrarTipo();
    }
}
