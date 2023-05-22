package br.com.fatec.padroes.singleton;

public class ConexaoSingleton {

    private static ConexaoSingleton instance;

    /*
    * Construtor privado
    */
    private ConexaoSingleton() {

    }

    public static synchronized ConexaoSingleton getInstance() {

        if(instance == null) {
            instance = new ConexaoSingleton();
        }

        return instance;
    }

    public void abrirConexao() {
        System.out.println("Conexão aberta - manda bala!");
    }
}
