package br.com.fatec.padroes.factory;

public class HotDog extends Pizza {

    public HotDog() {
        super.sabor = PizzaEnum.HOTDOG.toString();
    }
}
