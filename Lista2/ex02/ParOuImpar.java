package ex02;

import java.util.Scanner;
public class ParOuImpar {
    public static void main(String[] args) {
        Double valores[] = new Double[15];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Digite o valor na posição " + i + ": ");
            valores[i] = scan.nextDouble();
        }
        scan.close();

        System.out.printf("%-5s %-8s %-8s", "Item", "Valor", "Par/Impar\n");

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] % 2 == 0){
                System.out.printf("%-5d %-8.2f %-1s", (i+1), valores[i], "Par\n");
            } else System.out.printf("%-5d %-8.2f %-1s", (i+1), valores[i], "Impar\n");
        }
    }
}