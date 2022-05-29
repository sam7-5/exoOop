package WS1.Nimbus1;

import WS1.Observables.Sensor;

public class Nimbus1PressureSensor extends Sensor {

    public Nimbus1PressureSensor(String type, int interval){
        super(type, interval);
    }
    @Override
    public int read() {
        // pressure between 950 and 1050
        return RandomSupplier.getRnd().nextInt(100) + 950;
    }
}
