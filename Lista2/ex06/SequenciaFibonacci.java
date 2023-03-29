package ex06;

import java.util.Arrays;
import java.util.Scanner;

public class SequenciaFibonacci {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quantos elementos da sequência de Fibonacci você deseja (n): ");
        int n = scan.nextInt();

        scan.close();

        int fibonacci[] = new int[n];

        for (int i = 0; i < fibonacci.length; i++) {
            if(i == 0 || i == 1){
                fibonacci[i] = 1;
            } else {
                fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            }
        }

        System.out.println("Sequência de Fibonacci com " + n + " elementos: " + Arrays.toString(fibonacci));
    }
}
