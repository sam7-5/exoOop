package WS1.Observer;

public class MSPressObserver implements Observer{
    MonitoringScreen itsMonitoringScreen;
    MSPressObserver(MonitoringScreen monitoringScreen){
        System.out.println("MSPressObserver was created");
        itsMonitoringScreen = monitoringScreen;
    }


    @Override
    public void update(int data) {
        itsMonitoringScreen.displayTemperature(data);
    }
}
