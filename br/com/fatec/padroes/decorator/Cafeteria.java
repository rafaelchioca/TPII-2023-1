package br.com.fatec.padroes.decorator;

import br.com.fatec.padroes.decorator.impl.CafeExpresso;
import br.com.fatec.padroes.decorator.impl.Cappuccino;

public class Cafeteria {
    public static void main(String[] args) {

        Bebida expresso = new CafeExpresso();

        System.out.println(expresso.getDescricao() + " => " + expresso.valor() );

        Bebida cappuccino = new Cappuccino(expresso);

        System.out.println(cappuccino.getDescricao() + " => " + cappuccino.valor() );

    }
}
