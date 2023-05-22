package br.com.fatec.modelo;

public class Aviao implements ObjetoVoador {
    @Override
    public void voar() {
        System.out.println("Voa com motor");
    }
}
