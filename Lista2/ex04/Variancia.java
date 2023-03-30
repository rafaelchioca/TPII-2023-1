package ex04;

public class Variancia {
    public static void main(String[] args) {
        int[] jogador = new int[11];
        double[] acertos = {8, 4, 6, 10, 9, 7, 8, 12, 5, 8, 3};
        double[] xi = new double[11];
        double[] xi2 = new double[11];
        double m = 0D;
        double variancia = 0;
        double somaXi2 = 0;

        for (int i = 0; i < jogador.length; i++) {
            jogador[i] = i;
            m += acertos[i]/11;
            xi[i] = acertos[i];
        }

        for (int i = 0; i < jogador.length; i++) {
            xi[i] = xi[i] - m;

            xi2[i] = Math.pow((xi[i]), 2);
            somaXi2 += xi2[i];
        }

        variancia = somaXi2 / (acertos.length - 1);

        System.out.printf("%-10s %-10s %-10s %-10s\n", "Jogador", "Acertos", "Xi", "(Xi)²");
        for (int i = 0; i < xi.length; i++){
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f\n", jogador[i], acertos[i], xi[i], xi2[i]);
        }
        System.out.printf("Variância: %.2f\n", variancia);
    }
}
