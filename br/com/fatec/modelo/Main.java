package br.com.fatec.modelo;

public class Main {
    public static void main(String[] args) {
        ObjetoVoador aviao = new Aviao();
        ObjetoVoador urubu = new Urubu();

        aviao.voar();
        urubu.voar();

        // Animal a = new Urubu();
        // a.comer();

        Animal b;
        if(urubu instanceof Animal) {
            b = (Animal) urubu;
            b.comer();
        }
    }
    public void acao(ObjetoVoador o) {
        o.voar();

        if(o instanceof Animal) {
            ( (Animal) o).comer();
        }
    }
}
