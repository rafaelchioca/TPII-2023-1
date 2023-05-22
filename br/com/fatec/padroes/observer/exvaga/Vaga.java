package br.com.fatec.padroes.observer.exvaga;

public class Vaga {

    private String empresa;
    private Double salario;
    private String descricaoVaga;
    private ModeloContratacaoEnum modelo;

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getDescricaoVaga() {
        return descricaoVaga;
    }

    public void setDescricaoVaga(String descricaoVaga) {
        this.descricaoVaga = descricaoVaga;
    }

    public ModeloContratacaoEnum getModelo() {
        return modelo;
    }

    public void setModelo(ModeloContratacaoEnum modelo) {
        this.modelo = modelo;
    }
}
