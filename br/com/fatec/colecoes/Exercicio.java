package br.com.fatec.colecoes;

import java.util.ArrayList;
import java.util.List;

public class Exercicio {

    static List<Produto> listaProduto = new ArrayList<Produto>();

    public static void main(String[] args) {

        //preenche produtos
        for(int i = 0; i < 100; i++) {

            listaProduto.add(
                    new Produto(i * 10, "Faca " + i, (double) (i * 100)));
        }

        Produto produtoEncontrado = procurarPorCodigo(990);

        if(produtoEncontrado == null) {
            System.out.println("Produto não encontrado");
        } else {
            System.out.println("Achou");
            System.out.println(produtoEncontrado.getDescricao());
        }
        produtoEncontrado = procurarPorDescricao("faca");

        if(produtoEncontrado == null) {
            System.out.println("Produto não encontrado");
        } else {
            System.out.println("Achou");
            System.out.println(produtoEncontrado.getDescricao());
        }
    }

    public static Produto procurarPorCodigo(Integer codigo) {

        Produto produtoProcurado = new Produto();
        produtoProcurado.setCodigo(codigo);

        int posicaoProduto = listaProduto.indexOf(produtoProcurado);

        return listaProduto.get(posicaoProduto);
    }

    public static Produto procurarPorDescricao(String descricao) {
        for (Produto p:listaProduto) {
            if (descricao.equalsIgnoreCase(p.getDescricao())) {
                return p;
            }
        }
        return null;
    }

}