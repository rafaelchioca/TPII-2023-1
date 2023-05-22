package ex01;

import java.util.Scanner;
public class OrdemCrescente {
    public static void main(String[] args) {
        Double valores[] = new Double[3];


        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 3; i++) {
            System.out.println("Digite o " + (i+1) + "° número: ");
            valores[i] = scan.nextDouble();
        }
        scan.close();

        if (valores[0] <= valores[1] && valores[0] <= valores[2]) {
            if (valores[1] <=  valores[2]) {
                System.out.println(valores[0] + ", " +  valores[1] + ", " +  valores[2]);
            } else {
                System.out.println(valores[0] + ", " +  valores[2] + ", " + valores[1]);
            }
        } else if (valores[1] <= valores[0] && valores[1] <= valores[2]) {
            if (valores[0] <=  valores[2]) {
                System.out.println(valores[1] + ", " + valores[0] + ", " + valores[2]);
            } else {
                System.out.println(valores[1] + ", " +  valores[2] + ", " + valores[0]);
            }
        } else {
            if (valores[0] <= valores[1]) {
                System.out.println(valores[2] + ", " + valores[0] + ", " + valores[1]);
            } else {
                System.out.println(valores[2] + ", " + valores[1] + ", " + valores[0]);
            }
        }

    }
}
