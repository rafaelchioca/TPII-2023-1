package br.com.fatec.padroes.observer;

public class DisplayWeatherObserver implements Observer, Display {

    private Float temperature;
    private Float humidity;
    private Float pressure;

    @Override
    public void update(float temp, float humidity, float pressure) {

        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public void displayInfo() {
        System.out.println("Dados Meteorológicos");
        System.out.println(" - Temp:  " + this.temperature);
        System.out.println(" - Press:  " + this.pressure);
        System.out.println(" - Humidade:  " + this.humidity);
    }
}