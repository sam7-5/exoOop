package WS1.Nimbus1;

import WS1.Observables.AlarmClock;
import WS1.Observables.Sensor;
import WS1.Observables.SensorAlarmListener;

public class Nimbus1PressureSensor extends Sensor {

    public Nimbus1PressureSensor(String type, int interval){
        super(type, interval);
        AlarmClock.theInstance().register(1100, new SensorAlarmListener(this));
        System.out.println("pressure registered to clock");
    }
    @Override
    public int read() {
        // pressure between 950 and 1050
        return RandomSupplier.getRnd().nextInt(100) + 950;
    }
}
