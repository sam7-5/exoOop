public interface StationToolKit
{
    SensorImp makeTemperature();
    SensorImp makePressure();
    AlarmClockImp getAlarmClock();
    PersistentImp getPersistentImp();

}
