package WS1.Nimbus1;

import WS1.Observables.Sensor;

public class Nimbus1TemperatureSensor extends Sensor {

    public Nimbus1TemperatureSensor(String type, int interval){
        super(type, interval);
    }
    @Override
    public int read() {
        // temperature between 0 and 40
        return RandomSupplier.getRnd().nextInt(40);
    }
}
