package WS1.Observer;

public class LogPressObserver implements Observer{
    Log itsLog;
    LogPressObserver(Log log){
        System.out.println("LogPressObserver was created");
        itsLog = log;
    }


    @Override
    public void update(int data) {
        itsLog.displayPressure(data);
    }
}


