package br.com.fatec.padroes.factory.exercicio;

public class Barco extends Veiculo{
    private int potMotor;
    public Barco() {
        super.tipo = VeiculoEnum.BARCO.toString();
    }

    public int getPotMotor() {
        return potMotor;
    }

    public void setPotMotor(int potMotor) {
        this.potMotor = potMotor;
    }
}
