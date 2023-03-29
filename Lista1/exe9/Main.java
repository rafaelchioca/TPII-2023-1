package listaExercicio1.exe9;

import java.security.interfaces.DSAPublicKey;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Double valor = 0.0;
        Double selic = 0.0;
        Double rendimento = 0.0;

        int cont = 0;
        Double rendimentoTotal = 0.0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor da taxa selic: ");
        selic = scan.nextDouble();

        System.out.println("Digite um valor para aplicação: ");
        valor = scan.nextDouble();
        scan.close();

        Double valorRendido = valor;

        System.out.println("\nCDB Banco Pague Mais" + "\nTaxa selic: " + selic + "\nCapital investido: " + valor + "\nMes    Capital   Rendimento   Total");

        for (int i =0; i < 12; i++) {
            cont += 1;
            rendimento = valorRendido * (((selic/100) * 0.85));

            System.out.printf("\n" + cont + "      " + "%.2f", valorRendido);
            System.out.printf("      " + "%.2f", rendimento);
            System.out.printf("      " + "%.2f", (valorRendido + rendimento));
            valorRendido = valorRendido * (1+ ((selic/100) * 0.85));
            rendimentoTotal += rendimento;
        }
        Double desconto = valorRendido * 0.10;
        Double rendimentoLiquido = rendimentoTotal - desconto;

        System.out.printf("\nRendimento Total: R$ " + "%.2f", rendimentoTotal);
        System.out.printf("\nDescontos: R$ " + "%.2f", desconto);
        System.out.printf("\nRendimento Líquido: R$ " + "%.2f", rendimentoLiquido);

        System.out.println("\nCBD Fura Bolso" + "\nTaxa selic: " + selic + "\nCapital investido: " + valor + "\nMes    Capital   Rendimento   Total");

        cont = 0;
        rendimento = 0.0;
        rendimentoTotal = 0.0;
        valorRendido = valor;

        for (int i =0; i < 12; i++) {
            cont += 1;
            rendimento = valorRendido * (((selic/100) * 0.93));

            System.out.printf("\n" + cont + "      " + "%.2f", valorRendido);
            System.out.printf("      " + "%.2f", rendimento);
            System.out.printf("      " + "%.2f", (valorRendido + rendimento));
            valorRendido = valorRendido * (1+ ((selic/100) * 0.93));
            rendimentoTotal += rendimento;
        }
        desconto = (valorRendido * 0.06) + (valor * 0.01);
        rendimentoLiquido = rendimentoTotal - desconto;

        System.out.printf("\nRendimento Total: R$ " + "%.2f", rendimentoTotal);
        System.out.printf("\nDescontos: R$ " + "%.2f", desconto);
        System.out.printf("\nRendimento Líquido: R$ " + "%.2f", rendimentoLiquido);
    }
}
