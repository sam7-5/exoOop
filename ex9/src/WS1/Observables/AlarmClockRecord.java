package WS1.Observables;

public class AlarmClockRecord {
    private int interval;
    private int intervalDecrement;
    private AlarmListener alarmListener;

    public AlarmClockRecord(int interval, AlarmListener alarmListener) {
        this.interval = this.intervalDecrement = interval;
        this.alarmListener = alarmListener;
    }

    public int getInterval() {
        return interval;
    }

    public AlarmListener getAlarmListener() {
        return alarmListener;
    }

    public int getIntervalDecrement() {
        return intervalDecrement;
    }

    public void setIntervalDecrement(int intervalDecrement) {
        this.intervalDecrement = intervalDecrement;
    }
}