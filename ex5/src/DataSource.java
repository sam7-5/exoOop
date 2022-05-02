import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class DataSource {

    public static List<Customer> allCustomers;
    public static List<Order> allOrders;
    public static List<Product> allProducts;
    public static List<OrderProduct> allOrderProducts;
    // Update this path according to your data files location
    public static String basePath = "C:\\Users\\shmouel\\IdeaProjects\\exoOop\\ex5\\data";
    public static String customersPath = basePath + "customers.txt";
    public static String ordersPath = basePath + "orders.txt";
    public static String productsPath = basePath + "products.txt";
    public static String orderProductPath = basePath + "orderProduct.txt";

    static {
        try {
            allCustomers = readCustomersfromFile();
            allOrders = readOrdersfromFile();
            allProducts = readProductsfromFile();
            allOrderProducts = readOrderProductsfromFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Customer> readCustomersfromFile() throws IOException {

        return null;
    }

    public static List<Order> readOrdersfromFile() throws IOException {
        //To Do
        return null;
    }

    public static List<Product> readProductsfromFile() throws IOException {
        List<Product> lst =
                Files.lines(Paths.get(productsPath))
                        .map(Product::new)
                        .collect(Collectors.toList());
       return lst;
    }

    public static List<OrderProduct> readOrderProductsfromFile() throws IOException {
        List<OrderProduct> lst =
                Files.lines(Paths.get(productsPath))
                        .map(OrderProduct::new)
                        .collect(Collectors.toList());
        return lst;
    }
}


