package WS1.Observer;

public class LogPressTrendObserver implements Observer{
    Log itsLog;
    LogPressTrendObserver(Log log){
        System.out.println("LogPressTrendObserver was created");
        itsLog = log;
    }


    @Override
    public void update(int data) {
        itsLog.displayPressureTrend(data);
    }
}


