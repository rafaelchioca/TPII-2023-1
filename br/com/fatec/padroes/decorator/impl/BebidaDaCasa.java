package br.com.fatec.padroes.decorator.impl;

import br.com.fatec.padroes.decorator.Bebida;

public class BebidaDaCasa extends Bebida {
    public BebidaDaCasa() {
        super.descricao = "Bebida da casa S2";
    }

    @Override
    public Double valor() {
        return 5.00;
    }
}
