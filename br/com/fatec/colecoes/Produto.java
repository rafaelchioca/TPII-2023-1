package br.com.fatec.colecoes;

import java.util.Objects;

public class Produto {

    private Integer codigo;
    private String descricao;
    private Double valor;

    public Produto() {};

    public Produto(Integer codigo, String descricao, Double valor) {
        super();
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        return Objects.equals(codigo, other.codigo);
    }


}