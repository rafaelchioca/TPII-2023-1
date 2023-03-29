package ex07;

public class PopulacaoPaises {
    public static void main(String[] args) {

        int paisA = 5000000;
        Double taxaNatalidadeA = 0.03;
        int paisB = 7000000;
        Double taxaNatalidadeB = 0.02;
        int ano = 2000;
        int populacaoTotal = paisA + paisB;
        int tempo = 0;

        Double porcentagemPaisA = (double) paisA / (paisA + paisB) * 100;
        Double porcentagemPaisB = (double) paisB / (paisA + paisB) * 100;

        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s", "Ano", "PaísA", "PaísA%", "PaísB", "PaísB%", "População total\n");
        System.out.printf("%-8d   %-9d  (%.2f%%)  %-10d  (%.2f%%)  %-10d", ano, paisA, porcentagemPaisA, paisB, porcentagemPaisB, populacaoTotal);

        while (paisA <= paisB) {
            ano++;
            paisA += (int) (paisA * taxaNatalidadeA);
            paisB += (int) (paisB * taxaNatalidadeB);
            populacaoTotal = paisA + paisB;
            porcentagemPaisA = (double) paisA / (paisA + paisB) * 100;
            porcentagemPaisB = (double) paisB / (paisA + paisB) * 100;

            System.out.println("\n----------------------------------------------------------------------");
            System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s", "Ano", "PaísA", "PaísA%", "PaísB", "PaísB%", "População total\n");
            System.out.printf("%-8d   %-9d  (%.2f%%)  %-10d  (%.2f%%)  %-10d", ano, paisA, porcentagemPaisA, paisB, porcentagemPaisB, populacaoTotal);
        }
        tempo = ano - 2000;

        System.out.println("\n----------------------------------------------------------------------");
        System.out.printf("Em %d anos o país A ultrapassou a população do país B", tempo);
    }
}
