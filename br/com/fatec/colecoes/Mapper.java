package br.com.fatec.colecoes;

import java.util.HashMap;
import java.util.Map;


public class Mapper {
    public static void main(String...strings) {
        Map<Integer, Integer> listaChave = new HashMap<Integer, Integer>();

        listaChave.put(10, 50);
        listaChave.put(20, 500);
        listaChave.put(30, 888);
        listaChave.put(40, 799);

        System.out.println(listaChave.get(10)); // Se não encontrar uma chave com valor, o resultado será Null

        System.out.println(listaChave.put(10, 99));
        System.out.println(listaChave.get(10));

        for (Map.Entry<Integer, Integer> x : listaChave.entrySet()){ // Percorrer toda a lista
            System.out.println("chave: " + x.getKey() + " valor: " + x.getValue());
        }

        Integer a =(int) (Math.random() * 1000);

        System.out.println(a);

        Map<Integer, Integer> contNumeros = new HashMap<Integer, Integer>();

        for (int i = 0; i < 100000; i++) {

            Integer numero = (int) (Math.random() * 100);

            contNumeros.put(numero, contNumeros.getOrDefault(numero, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> x : contNumeros.entrySet()){
            System.out.println("Chave: " + x.getKey() + ", Valor: " + x.getValue());
        }

        contNumeros.remove(10); // para remover
    }
}
