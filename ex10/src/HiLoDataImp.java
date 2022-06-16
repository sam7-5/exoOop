import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// TODO: implement Proxy design pattern
class HiLoDataImp implements HiLoData, java.io.Serializable {

    private double itsLowValue;
    private LocalDateTime itsLowTime;

    private double itsHighValue;
    private LocalDateTime itsHighTime;

    private String itsType;

    transient private String itsStorageKey;
    transient private api.PersistentImp itsPI;

    public double getItsHighValue() {
        return itsHighValue;
    }

    public double getItsLowValue() {
        return itsLowValue;
    }

    public LocalDateTime getItsHighTime() {
        return itsHighTime;
    }

    public LocalDateTime getItsLowTime() {
        return itsLowTime;
    }

    public HiLoDataImp(StationToolKit st, String type, int init, LocalDateTime time) {

        itsPI = st.getPersistentImp();
        this.itsType = type;
        itsStorageKey = calculateStorageKey(time);

        try {
            HiLoData t = (HiLoData) itsPI.retrieve(itsStorageKey);
            itsLowValue = t.getItsLowValue();
            itsLowTime = t.getItsLowTime();
            itsHighValue = t.getitsHighValue();
            itsLowTime = t.getLowTime();
            currentReading(init, time);
        } catch (retrieveException re) {

            itsHighValue = itsLowValue = init;
            itsLowTime = itsHighTime = time;
        }
    }

    @Override
    public void newDay(int initial, LocalDateTime time) {

        store();
        itsHighValue = itsLowValue = initial;
        itsLowTime = itsHighTime = time;

        itsStorageKey = calculateStorageKey(time);
        store();
    }

    @Override
    public boolean currentReading(int value, LocalDateTime time) {
        if (value > itsHighValue) {
            itsHighValue = value;
            itsHighTime = time;
            store();
            return true;

        } else if (value < itsLowValue) {
            itsLowValue = value;
            itsLowTime = time;
            store();
            return true;
        }
        return false;
    }

    private void store() {
        try {
            itsPI.store(itsStorageKey, this);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private String calculateStorageKey(LocalDateTime d) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMddyyyy");
        return (type + "Hilo" + df.format(d));
    }
}