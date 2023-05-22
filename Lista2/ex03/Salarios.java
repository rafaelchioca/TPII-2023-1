package ex03;

import java.util.Scanner;
public class Salarios {
    public static void main(String[] args) {
        Double salarios[] = new Double[20];
        Double salariosNovos[] = new Double[20];
        Double diferençaSalarios[] = new Double[20];

        Double totalSalarios = 0D;
        Double totalSalariosNovos = 0D;
        Double totalDiferençaSalarios = 0D;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < salarios.length; i++) {
            System.out.println("Digite o salário da pessoa " + (i+1) + ": ");
            salarios[i] = scan.nextDouble();
            salariosNovos[i] = salarios[i] * 1.08;
            diferençaSalarios[i] = salariosNovos[i] - salarios[i];

            totalSalarios += salarios[i];
            totalSalariosNovos += salariosNovos[i];
            totalDiferençaSalarios += diferençaSalarios[i];
        }
        scan.close();

        System.out.printf("%-6s %-12s %-12s %-12s\n", "Item", "Salário", "NovoSalário", "Diferença");
        for (int i = 0; i < salarios.length; i++) {
            System.out.printf("%-6d %-12.2f %-12.2f %-12.2f\n", (i+1) , salarios[i], salariosNovos[i], diferençaSalarios[i]);
        }
        System.out.printf("%-6s %-12.2f %-12.2f %-12.2f\n", "Total", totalSalarios, totalSalariosNovos, totalDiferençaSalarios);
    }
}
