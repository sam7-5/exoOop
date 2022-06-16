

public class WeatherMonitoringSystem {
    public static WeatherMonitoringSystem instance = null;
    private StationToolKit st;
    private AlarmClock ac;
    private Sensor ts;
    private Sensor ps;
    private PressureTrendSensor sensor;
    private TemperatureHiLo thl;

    private WeatherMonitoringSystem() {
        System.out.println("WeatherMonitoringSystem was created");

        st = new Nimbus1StationToolKit();
        ac = new AlarmClock(st);

        ts = new Sensor(ac, "TemperatureSensor", 6000, st);
        ps = new Sensor(ac, "PressureSensor", 6000, st);
        sensor = new PressureTrendSensor(ps);
        thl = new TemperatureHiLo(ts, ac, st);
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
