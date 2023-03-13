package listaExercicio1.exe10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crie um programa que solicite o usuário o informe de 10 vendas. A cada venda deverá ser informado: codigo produto, valor unitario e quantidade.
        Scanner scan = new Scanner(System.in);

        Venda[] vendas = new Venda[10];



        // a. A cada venda informada mostrar o valor total (quantidade * valor unitario);
        for (int i = 0; i < vendas.length; i++) {
            System.out.println("Venda " + (i+1));

            System.out.println("Informe o código do produto: ");
            Integer codigo = scan.nextInt();

            System.out.println("Informe o valor unitário: ");
            Double valorUnit = scan.nextDouble();

            System.out.println("Informe a quantidade do produto: ");
            Double qtde = scan.nextDouble();

            vendas[i] = new Venda(codigo, valorUnit, qtde);
            System.out.println("Valor total da venda " + (i+1) + ": R$ " + vendas[i].valorTotal() + "\n");
        }
        scan.close();

        // b. Valor médio vendido;
        Double valorTotalVendido = 0.0;
        Double quantidadeTotalVendida = 0.0;
        for (int i = 0; i < vendas.length; i++) {
            valorTotalVendido += vendas[i].valorTotal();
            quantidadeTotalVendida += vendas[i].qtde;
        }
        System.out.println("Valor médio vendido: R$ " + (valorTotalVendido / quantidadeTotalVendida));


        // c. Mostrar o código do produto, quantidade e valor total do produto com maior venda;
        Double  valorMaiorVenda = vendas[0].valorTotal();
        Integer codMaiorVenda = vendas[0].codigo;
        Double quantidadeMaiorVenda = vendas[0].qtde;

        for (int i = 0; i < vendas.length; i++) {
            if(vendas[i].valorTotal() > valorMaiorVenda) {
                valorMaiorVenda = vendas[i].valorTotal();
                codMaiorVenda = vendas[i].codigo;
            }
        }
        System.out.println("CódProdMaiorVenda: " + codMaiorVenda + ", QuantidadeMaiorVenda: " + quantidadeMaiorVenda + ", ValorTotalMaiorVenda: R$ " + valorMaiorVenda);


        // d. Mostrar o código do produto, quantidade e valor total do produto com menor venda;
        Double valorMenorVenda = vendas[0].valorTotal();
        Integer codMenorVenda = vendas[0].codigo;
        Double quantidadeMenorVenda = vendas[0].qtde;

        for (int i = 0; i < vendas.length; i++) {
            if(vendas[i].valorTotal() < valorMenorVenda) {
                valorMenorVenda = vendas[i].valorTotal();
                codMenorVenda = vendas[i].codigo;
            }
        }
        System.out.println("CódProdMenorVenda: " + codMenorVenda + ", QuantidadeMenorVenda: " + quantidadeMenorVenda + ", ValorTotalMenorVenda: R$ " + valorMenorVenda);

        // e. Mostrar o valor Total Vendido;
        System.out.println("Valor total vendido: R$ " + valorTotalVendido);

        // f. Mostrar a quantidade total de itens vendidos;
        System.out.println("Quantidade total vendido: " + quantidadeTotalVendida);
    }
}
