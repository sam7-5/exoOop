import WS1.Observables.WeatherMonitoringSystem;
import WS1.Observer.Log;
import WS1.Observer.MonitoringScreen;

public class MainClassWS2
{
    public static void main(String[] args) {
        WeatherMonitoringSystem ws = WeatherMonitoringSystem.theInstance();
        MonitoringScreen p_MonitorScreen = new MonitoringScreen();
        Log p_log = new Log();
    }
}
