package br.com.fatec.padroes.observer;

public class AlarmObserver implements Observer, Alarm {

    private int countTempAlarme;

    @Override
    public void update(float temp, float humidity, float pressure) {

        if(temp > 50) {
            countTempAlarme++;
            disparar();
        }
    }

    public int getCountAlarme() {
        return this.countTempAlarme;
    }

    @Override
    public void disparar() {
        System.out.println("Alarme disparando");
    }
}
