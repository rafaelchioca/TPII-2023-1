package br.com.fatec.padroes.factory;

public abstract class Pizza {
    protected String sabor;

    public void mostrarSabor() {
        System.out.println("Sabor é: " + this.sabor);
    }
}
