package br.com.fatec.padroes.factory.exercicio;

public class Carro extends Veiculo {

    private int qtdPortas;

    public Carro() {
        super.tipo = VeiculoEnum.CARRO.toString();
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }
}
