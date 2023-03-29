package listaExercicio1.exe4;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Crie um programa que receba um número inteiro n e leia n valores do teclado e compute quantos destes valores são negativos.
        int n = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número n: ");
        n = scan.nextInt();

        int [] lista = new int[n];

        System.out.println("\nO número n que você digitou foi: " + n);

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o valor na posição: " + i);
            lista[i] = scan.nextInt();
        }
        scan.close();

        int negativo = 0;
        for (int i = 0; i < n; i++) {
            if(lista[i] < 0){
                negativo += 1;
            }
        }
        if (negativo > 0) {
            System.out.println(negativo +" valores digitados são negativos");
        } else {
            System.out.println("Não foram digitados valores negativos");
        }
    }
}
