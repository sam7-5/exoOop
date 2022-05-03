import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class test {
    public static void main(String args[])  {
      long pro=12;
        try {

            List<Order> lst=DataSource.readOrdersfromFile();
            //Order tmp =  .stream().filter(o -> o.getOrderId() == pro);

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
