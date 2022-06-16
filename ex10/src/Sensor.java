import WS1.Observables.Observable;

public abstract class Sensor extends Observable {
    public int lastReading;
    public int interval;
    public String type;

    public SensorImp sensorImp;

    protected Sensor(SensorImp sensorImp, String type, int interval) {
        this.sensorImp = sensorImp;
        this.type = type;
        this.interval = interval;
    }

    public abstract int read();

    public void check() {
        int temp = read();
        if (temp != lastReading) { notifyObservers(temp); }
        lastReading = temp;
    }
}
