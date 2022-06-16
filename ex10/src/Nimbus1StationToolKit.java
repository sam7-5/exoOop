
public class Nimbus1StationToolKit implements StationToolKit {

    @Override
    public SensorImp makeTemperature() {
        return new Nimbus1TemperatureSensor();
    }

    @Override
    public SensorImp makePressure() {
        return new Nimbus1PressureSensor();
    }

    @Override
    public AlarmClockImp getAlarmClock() {
        return Nimbus1Clock.theInstance();
    }

    @Override
    public PersistentImp getPersistentImp() {
        return new Nimbus1NVM();
    }
}
