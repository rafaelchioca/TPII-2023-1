package br.com.fatec.padroes.factory.exercicio;

public class Moto extends Veiculo{
    private int qtdCilindradas;
    public Moto() {
        super.tipo = VeiculoEnum.MOTO.toString();
    }

    public int getQtdCilindradas() {
        return qtdCilindradas;
    }

    public void setQtdCilindradas(int qtdPortas) {
        this.qtdCilindradas = qtdPortas;
    }
}
