
import java.util.stream.IntStream;

class Program {
    public static void main(String args[]) {

        IntStream.generate(()->3).forEach(e -> System.out.println(e));
    }
} 