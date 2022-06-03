package WS1.Observer;

public class MSTempObserver implements Observer {
    MonitoringScreen itsMonitoringScreen;
    MSTempObserver(MonitoringScreen monitoringScreen){
        System.out.println("MSTempObserver was created");
         itsMonitoringScreen = monitoringScreen;
    }


    @Override
    public void update(int data) {
        itsMonitoringScreen.displayTemperature(data);
    }
}
