package br.com.fatec.padroes.observer;

import br.com.fatec.padroes.observer.impl.WeatherSensorSubject;

public class App {
    public static void main(String[] args) {
        WeatherSensorSubject sensor = new WeatherSensorSubject();

        DisplayWeatherObserver displayObserver = new DisplayWeatherObserver();
        DisplayWeatherObserver display2 = new DisplayWeatherObserver();

        AlarmObserver alarm = new AlarmObserver();
        sensor.registerObserver(displayObserver);
        sensor.registerObserver(display2);
        sensor.registerObserver(alarm);

        sensor.setWeatherData(30.0F, 40.0F, 20.0F);
        displayObserver.displayInfo();
        display2.displayInfo();

        sensor.setWeatherData(69F, 40F, 20F);
        System.out.println(alarm.getCountAlarme());

    }
}
