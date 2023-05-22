package br.com.fatec.padroes.observer.exvaga;

public class EmailObserver implements VagaObserver {

    private Vaga vaga;

    @Override
    public void update(Vaga vaga) {
        this.vaga = vaga;
    }

    private void sendMail() {
        System.out.println("Enviando email... " + vaga.getDescricaoVaga());
    }
}
