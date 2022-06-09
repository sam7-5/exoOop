package WS1.Observer;

import WS1.Nimbus1.Nimbus1TemperatureSensor;
import WS1.Observables.WeatherMonitoringSystem;

public class MonitoringScreen {
    public MonitoringScreen(WeatherMonitoringSystem ws) {
        System.out.println("MonitoringScreen was created");
        ws.theInstance().addTemperatureObserver(this::displayTemperature);
        ws.theInstance().addPressureObserver(this::displayPressure);
    }


    public void displayTemperature(int data) {
        System.out.println("MonitoringScreen: temperature = " + data + " Celsius");
    }


    public void displayPressure(int data) {
        System.out.println("MonitoringScreen: pressure = " + data + " millibars");
    }
}

