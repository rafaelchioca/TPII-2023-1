package br.com.fatec.colecoes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaValores = new ArrayList<Integer>();

        listaValores.add(10);
        listaValores.add(100);
        listaValores.add(99);

//        Forma simples
        for (int i = 0; i < listaValores.size(); i++) {
            System.out.println(listaValores.get(i));
        }

//        Forma usual
        for (Integer x: listaValores) {
            System.out.println(x);
        }

        listaValores.forEach( x -> {
            System.out.println(x);
        });

        List<Aluno> listaAlunos = new ArrayList<Aluno>();

        listaAlunos.add(new Aluno(1, "Rafael", "2546"));
        listaAlunos.add(new Aluno(2, "Fabio", "1234"));
        listaAlunos.add(new Aluno(3, "Kessia", "9876"));

        listaAlunos.forEach(a -> {
            System.out.println(a);

        });

        Aluno x = new Aluno();
        x.setCpf("9876");
        System.out.println(listaAlunos.contains(x));
    }
}
