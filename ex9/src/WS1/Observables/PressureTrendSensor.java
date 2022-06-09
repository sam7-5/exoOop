package WS1.Observables;

import WS1.Nimbus1.Nimbus1PressureSensor;
import WS1.Observer.Observer;

public class PressureTrendSensor extends Observable implements Observer {
     int lastReading = 0;
     int lastReading1 = 0;
     int lastReading2 = 0;
     int lastTrend=0;
    PressureTrendSensor(Nimbus1PressureSensor itsBPS){
        itsBPS.addObserver(this);
        System.out.println("PressureTrendSensor observes pressure");
    }
    public int calcTrend(int data) {

        lastReading = lastReading1;
        lastReading1 = lastReading2;
        lastReading2 = data;

        if(lastReading < lastReading1 && lastReading1 < lastReading2)
            return 1;
        if(lastReading1 > lastReading2 && lastReading > lastReading1)
            return 2;
        return 0;
    }

    public void check(int data) {
        int trend = calcTrend(data);
        if(trend !=lastTrend)
            this.notifyObservers(trend);
        lastTrend=trend;
    }

    public void update(int data) {
        check(data);
    }

    public void addObserver(Observer ob) {
    }
}
