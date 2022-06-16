



import java.time.LocalDateTime;

public class Nimbus1Clock extends AlarmClockImp
{
    // TODO: Do not change this class and do not submit it.
    final int CLOCK_INTERVAL_MILLIS = 100;
    LocalDateTime time = LocalDateTime.of(2022,5,25,19,00,00);
    public LocalDateTime getTime() {
        return time;
    }
    private Nimbus1Clock()
    {
        new Thread("polling Alarm Clock Records")
        {
            public void run()
            {
                System.out.println("running clock thread ---");
                for(int i=0;i<60;i++)
                {
                    notifyClockListeners();
                    time = time.plusMinutes(30);
                    try  { Thread.sleep(CLOCK_INTERVAL_MILLIS);}
                    catch (InterruptedException e) { e.printStackTrace(); }
                }
            }
        }.start();
    }

    public static AlarmClockImp theInstance()
    {
        if(null==instance)
            instance = new Nimbus1Clock();
        return instance;
    }
}
