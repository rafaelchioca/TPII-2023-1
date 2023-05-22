package br.com.fatec.colecoes;

import java.util.*;

/**
 * Crie um sistema para gerenciar apostas na mega sena de 6 dezenas;
 * Solicite ao usuário informar as dezenas de "azar".
 *
 * O programa deverá gerar a quantidade de apostas solicitadas, porém, desconsiderar os números de azar
 *
 * Usuário poderá fazer N apostas.
 *
 * Depois de realizadas as apostas, crie um mecanismo que com base
 * no resultado do sorteio confirme se houve apostas vencedoras.
 *
 * Exiba todas as apostas ao final indicando qual foi a vencedora.
 *
 */
public class MegaSena {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a quantidade de apostas: ");
        int apostas = scan.nextInt();
        scan.close();

        List<Integer> listaAzar = new ArrayList<Integer>();
        listaAzar.add(13);
        listaAzar.add(50);
        listaAzar.add(22);
        listaAzar.add(10);
        listaAzar.add(20);


        for (int i = 0; i < apostas; i++) {
            Aposta aposta = gerarAposta(listaAzar);

            System.out.println(aposta.getDezenas().toString());
        }

    }

    public static Aposta gerarAposta (List<Integer> numerosAzar) {

        Aposta novaAposta = new Aposta();

        List<Integer> dezenas = new ArrayList<Integer>();

        for (int i = 0; i < 6; i++) {

            Integer aposta = (int) (Math.random() * 100);

            if(aposta <= 0 || aposta > 60
                    || numerosAzar.contains(aposta)
                    || dezenas.contains(aposta)) {
                i--;
                continue;
            }
            dezenas.add(aposta);
        }

        novaAposta.setCodigo(10);
        novaAposta.setDezenas(dezenas);

        return novaAposta;
    }
}
