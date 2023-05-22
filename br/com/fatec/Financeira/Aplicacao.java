package br.com.fatec.Financeira;

public interface Aplicacao {
    public void deposito (Conta conta, Double valor);

    public Double saque (Conta conta, Double valor);
}
