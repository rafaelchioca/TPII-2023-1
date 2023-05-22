package br.com.fatec.padroes.factory;

public class Lombinho extends Pizza {

    public Lombinho() {
        super.sabor = PizzaEnum.LOMBINHO.toString();
    }
}
