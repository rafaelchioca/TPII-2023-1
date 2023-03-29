package listaExercicio1.exe5;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Crie um programa que receba um valor inteiro informado pelo usuário e determine se esse valor é um número primo.
        int valor = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        valor = scan.nextInt();
        scan.close();

        for(int i = 2; i < valor; i++) {
            boolean primo = true;
            for(int j = 2; j < i; j++){
                if (valor % j == 0) {
                    primo = false;
                }
            }
            System.out.println(primo);
        }
    }
}
