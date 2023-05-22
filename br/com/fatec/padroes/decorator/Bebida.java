package br.com.fatec.padroes.decorator;

public abstract class Bebida {

    protected String descricao = "sem bebida";

    public String getDescricao() {
        return this.descricao;
    }

    public abstract Double valor();
}
