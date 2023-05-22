package br.com.fatec.padroes.decorator.impl;

import br.com.fatec.padroes.decorator.Bebida;
import br.com.fatec.padroes.decorator.BebidaDecorator;

public class Cappuccino extends BebidaDecorator {

    private Bebida bebida;

    public Cappuccino(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public Double valor() {
        return bebida.valor() + 2.19;
    }

    @Override
    public String getDescricao() {
        return "Cappuccino Feliz";
    }
}
