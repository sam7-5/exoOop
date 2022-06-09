package WS1.Nimbus1;

import WS1.Observables.AlarmClock;
import WS1.Observables.Sensor;
import WS1.Observables.SensorAlarmListener;
import WS1.Observer.MSTempObserver;

public class Nimbus1TemperatureSensor extends Sensor {

    public Nimbus1TemperatureSensor(String type, int interval){

        super(type, interval);
        AlarmClock.theInstance().register(700, new SensorAlarmListener(this));
        System.out.println("temperature registered to clock");
    }




    @Override
    public int read() {
        // temperature between 0 and 40
        return RandomSupplier.getRnd().nextInt(40);
    }


}
