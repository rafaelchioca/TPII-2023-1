package ex05;

import java.util.Scanner;
public class NotaConceito {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número do aluno: ");
        int nAluno = scan.nextInt();

        System.out.println("Digite a nota 1 do aluno " + nAluno + ": ");
        Double nota1 = scan.nextDouble();

        System.out.println("Digite a nota 2 do aluno " + nAluno + ": ");
        Double nota2 = scan.nextDouble();

        System.out.println("Digite a nota 3 do aluno " + nAluno + ": ");
        Double nota3 = scan.nextDouble();

        System.out.println("Digite a média dos exercícios do aluno " + nAluno + ": ");
        Double ME = scan.nextDouble();

        scan.close();

        Double MA = (nota1 + (nota2 * 2 ) + (nota3 * 3) + ME ) / 7D;

        String conceito = "";

        if (MA >= 9.0) {
            conceito = "A";
        } else if (MA >= 7.5) {
            conceito = "B";
        } else if (MA >= 6.0) {
             conceito = "C";
        } else if (MA >= 4.0) {
            conceito = "D";
        } else if (MA < 4.0) {
            conceito = "E";
        }

        System.out.printf("Aluno: %d\n", nAluno);
        System.out.printf("Nota 1: %.2f\n", nota1);
        System.out.printf("Nota 2: %.2f\n", nota2);
        System.out.printf("Nota 3: %.2f\n", nota3);
        System.out.printf("Média dos Exercícios: %.2f\n", ME);
        System.out.printf("Média de Aproveitamento: %.2f\n", MA);
        System.out.printf("Conceito: %s\n", conceito);

        if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
    }
}
