package br.com.fatec.padroes.factory.impl;

import br.com.fatec.padroes.factory.Pizza;
import br.com.fatec.padroes.factory.PizzaEnum;
import br.com.fatec.padroes.factory.PizzaFactory;

public class Teste {
    public static void main(String[] args) {

        PizzaFactory factory = new PizzaFactory();

        Pizza p = factory.create(PizzaEnum.CALABRESA);

        p.mostrarSabor();

        Pizza p2 = factory.create(PizzaEnum.HOTDOG);
        Pizza p3 = factory.create(PizzaEnum.LOMBINHO);

        p2.mostrarSabor();
        p3.mostrarSabor();

    }
}
