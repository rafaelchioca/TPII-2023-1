package br.com.fatec.Financeira;

public class Conta {
    private Integer numero;
    private Double saldo = 0.0;

    // Construtor
    public Conta(Integer numero) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
