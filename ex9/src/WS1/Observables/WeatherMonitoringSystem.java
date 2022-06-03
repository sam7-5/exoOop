package WS1.Observables;

import WS1.Nimbus1.Nimbus1Clock;

public class WeatherMonitoringSystem {
    protected static WeatherMonitoringSystem instance=null;
    WeatherMonitoringSystem(){
        System.out.println("WeatherMonitoringSystem was created");
        AlarmClock alarmClock= Nimbus1Clock.theInstance();
    }
    public static WeatherMonitoringSystem theInstance(){
        if(instance==null){
            instance=new WeatherMonitoringSystem();
        }
        return instance;
    }


}
