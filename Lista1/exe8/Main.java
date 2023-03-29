package listaExercicio1.exe8;

public class Main {
    public static void main(String[] args) {
        // Sejam as amostras de tamanho n=5, X={2,7,4,3,2} e Y={1,2,3,6,5}, realize os cálculos

        int n = 5;
        int [] x = {2 , 7 , 4, 3, 2};
        int [] y = {1 , 2 , 3, 6, 5};

        int a = 0;
        int b = 0;
        int c = 0;

        for(int i = 0; i < 5; i++) {
            a += x[i];
        }
        System.out.println("O cálculo a = " + a);

        for(int i = 0; i < 5; i++) {
            b += (x[i] * y[i]);
        }
        System.out.println("O cálculo b = " + b);

        for(int i = 0; i < 5; i++) {
            c += (x[i] * Math.pow(y[i], 2) + 15);
        }
        System.out.println("O cálculo C = " + c);
    }
}
