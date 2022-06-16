package WS1.Observables;

import WS1.Nimbus1.Nimbus1Clock;
import WS1.Nimbus1.Nimbus1PressureSensor;
import WS1.Nimbus1.Nimbus1TemperatureSensor;
import WS1.Observer.MonitoringScreen;
import WS1.Observer.Observer;

public class WeatherMonitoringSystem {
    protected static WeatherMonitoringSystem instance = null;
    private Nimbus1TemperatureSensor itsTS;
    private Nimbus1PressureSensor itsBPS;
    private PressureTrendSensor itsBPT;
   // private MonitoringScreen itsScreen;

    protected WeatherMonitoringSystem() {
        System.out.println("WeatherMonitoringSystem was created");
        AlarmClock alarmClock = Nimbus1Clock.theInstance();

        itsTS = new Nimbus1TemperatureSensor("nimbus1Temperature",0);
        itsBPS = new Nimbus1PressureSensor("nimbus1Pressure",0);
        itsBPT = new PressureTrendSensor(itsBPS);
        //itsScreen= new MonitoringScreen();


    }

    public static WeatherMonitoringSystem theInstance() {
        if (instance == null) {
            instance = new WeatherMonitoringSystem();
        }
        return instance;
    }

    public void addTemperatureObserver(Observer ob) {
        itsTS.addObserver(ob);
        System.out.println(ob.getClass().getName() + /*"MSTempObserver */" observes temperature");
    }

    public void addPressureObserver(Observer ob) {
        itsBPS.addObserver(ob);
        System.out.println(ob.getClass().getName() + " observes pressure");

    }

    public void addPressureTrendObserver(Observer ob) {
        itsBPT.addObserver(ob);
        System.out.println("LogPressTrendObserver observes pressure trend");
    }

}
