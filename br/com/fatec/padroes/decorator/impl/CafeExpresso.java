package br.com.fatec.padroes.decorator.impl;

import br.com.fatec.padroes.decorator.Bebida;

public class CafeExpresso extends Bebida {

    public CafeExpresso() {
        super.descricao = "Cafe Expresso";
    }

    @Override
    public Double valor() {
        return 3.5;
    }
}
