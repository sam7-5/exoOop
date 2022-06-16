import WS1.Observables.AlarmClock;
import WS1.Observables.PressureTrendSensor;
import WS1.Observables.Sensor;

public class TemperatureHiLo implements AlarmListener implements Observer{
    AlarmClock itsAlarmClock;
    HiLoData itsHiLoData;
    Sensor itsSensor;
    public TemperatureHiLo(Sensor sensor, AlarmClock ac, StationToolKit st) {
        ac.wakeEveryDay(this);
        sensor.addObserver(this)
    }



    public void update(int val) {
        time=itsAlarmClock.getTime();
        itsAlarmClock.currentReading(val,time);
    }

    public void wakeUp() {
        // TODO: complete
    }
}
