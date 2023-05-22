package br.com.fatec.padroes.singleton.impl;

import br.com.fatec.padroes.singleton.ConexaoSingleton;

public class Teste {
    public static void main(String[] args) {

        ConexaoSingleton.getInstance().abrirConexao();

        ConexaoSingleton c = ConexaoSingleton.getInstance();

        c.abrirConexao();
    }
}
