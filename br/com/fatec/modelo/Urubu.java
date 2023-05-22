package br.com.fatec.modelo;

public class Urubu implements ObjetoVoador, Animal {
    @Override
    public void voar() {
        System.out.println("Voa com asas");
    }

    @Override
    public void comer() {
        System.out.println("Carniça");
    }
}
