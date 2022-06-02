package WS1.Observables;

public abstract class Sensor extends Observable {
    public int lastReading;
    public int interval;
    public String type;

    protected Sensor(String type, int interval) {
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
