package WS1.Observer;

import WS1.Observables.WeatherMonitoringSystem;

public class Log {
    public Log(WeatherMonitoringSystem ws) {
        System.out.println("Log was created");

    }

    public void displayPressure(int data) {
        System.out.println("Log: pressure = " + data + " millibars");
    }

    public void displayPressureTrend(int data) {
        switch (data) {
            case 0:
                System.out.println("Log: pressure trend = STABLE");
                break;
            case 1:
                System.out.println("Log: pressure trend = RISING");
                break;
            case 2:
                System.out.println("Log: pressure trend = FALLING");
                break;
            default:
                System.out.println("problem in displayPressureTrend");

        }
    }
}
