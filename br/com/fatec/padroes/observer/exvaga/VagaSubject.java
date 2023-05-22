package br.com.fatec.padroes.observer.exvaga;

import br.com.fatec.padroes.observer.Observer;

import javax.print.attribute.standard.JobStateReason;
import java.util.ArrayList;
import java.util.List;


public class VagaSubject implements Subject {

    private List<VagaObserver> observers = new ArrayList<VagaObserver>();

    private List<Vaga> listaVagas = new ArrayList<Vaga>();

    private Vaga vaga;

    public void newVaga(Vaga novaVaga) {
        this.vaga = novaVaga;
        this.listaVagas.add(vaga);

        this.notifyObservers();
    }

    @Override
    public void registerObserver(VagaObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(VagaObserver observer) {
        this.observers.remove(observer);

    }

    @Override
    public void notifyObservers() {

        for(VagaObserver o : this.observers) {
            o.update(this.vaga);
        }

    }
}