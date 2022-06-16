import WS1.Observables.AlarmClock;
import WS1.Observables.PressureTrendSensor;
import WS1.Observables.Sensor;

public class WeatherMonitoringSystem
{
    public static WeatherMonitoringSystem instance = null;

    private WeatherMonitoringSystem()    {
        // TODO: complete. Initialize the toolkit, clock, sensors and temperatureHiLo
        Nimbus1StationToolKit st=new Nimbus1StationToolKit();
        AlarmClock ac=new AlarmClock(StationToolKit st);
        Sensor ps=new Sensor(AlarmClock ac, String typeOfSensor, int checkInterval, StationToolKit toolkit);
        PressureTrendSensor sensor=new PressureTrendSensor(Sensor ps);
        TemperatureHiLo(Sensor sensor, AlarmClock ac, StationToolKit st);
    }


    public static WeatherMonitoringSystem theInstance() {
        if (instance == null) {
            instance = new WeatherMonitoringSystem();
        }
        return instance;
    }
    // TODO: add functions for adding observers


}
