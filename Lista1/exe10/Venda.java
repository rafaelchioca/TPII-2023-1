package listaExercicio1.exe10;

public class Venda {
    Integer codigo;
    Double valorUnit;
    Double qtde;

    public Venda(Integer codigo, Double valorUnit, Double qtde) {
        this.codigo = codigo;
        this.valorUnit = valorUnit;
        this.qtde = qtde;
    }

    public double valorTotal() {
        return valorUnit * qtde;
    }
}

