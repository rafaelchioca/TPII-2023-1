package br.com.fatec.Financeira;

public class Main {
    public static void main(String... strings) {

        Conta c1 = new Conta(100);
        System.out.println("Conta: " +c1.getNumero());
//        c1.setSaldo(400.0);
        System.out.println("Saldo: " + c1.getSaldo());

        Aplicacao aplicacao = new BinBank();
        aplicacao.deposito(c1, 999.99);
        System.out.println("Conta: " +c1.getNumero());
        System.out.println("Saldo: " + c1.getSaldo());

        Conta c2 = new Conta(200);
        Aplicacao aplicacao2 = new BinBank();
        aplicacao2.deposito(c2, 1000.00);

        System.out.println("Conta: " +c2.getNumero());
        System.out.println("Saldo: " + c2.getSaldo());

    }
}
