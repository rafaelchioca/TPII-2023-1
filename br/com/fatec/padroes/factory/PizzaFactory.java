package br.com.fatec.padroes.factory;

public class PizzaFactory {

    public Pizza create(PizzaEnum type) {

        Pizza p = null;

        if(PizzaEnum.CALABRESA.equals(type)) {
            p = new Calabresa();
        } else if (PizzaEnum.HOTDOG.equals(type)) {
            p = new HotDog();
        } else if (PizzaEnum.LOMBINHO.equals(type)) {
            p = new Lombinho();
        }

        return p;
    }
}
