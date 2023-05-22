package br.com.fatec.padroes.factory.exercicio;

public abstract class Veiculo {
    protected String marca;
    protected String tipo;

    public void mostrarTipo() {
        System.out.println("Tipo é: " + this.tipo);
    }
}
