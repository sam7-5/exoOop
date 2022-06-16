import WS1.Nimbus1.Nimbus1TemperatureSensor;

public class Nimbus1StationToolKit implements StationToolKit {

    @Override
    public SensorImp makeTemperature() {
        return null;
    }

    @Override
    public SensorImp makePressure() {
        return null;
    }

    @Override
    public AlarmClockImp getAlarmClock() {
        return Nimbus1Clock.theInstance();
    }

    @Override
    public PersistentImp getPersistentImp() {
        return null;
    }
    // TODO: complete
}
