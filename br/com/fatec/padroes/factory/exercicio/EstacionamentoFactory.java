package br.com.fatec.padroes.factory.exercicio;

public class EstacionamentoFactory {
    public Veiculo create(VeiculoEnum type) {

        Veiculo v = null;

        if(VeiculoEnum.CARRO.equals(type)) {
            v = new Carro();
        } else if (VeiculoEnum.MOTO.equals(type)) {
            v = new Moto();
        } else if (VeiculoEnum.BARCO.equals(type)) {
            v = new Barco();
        }

        return v;
    }
}
