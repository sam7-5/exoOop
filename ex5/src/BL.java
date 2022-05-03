import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.reverseOrder;
import static java.util.Map.Entry.comparingByValue;
import static java.util.function.UnaryOperator.identity;
import static java.util.stream.Collectors.*;

public class BL implements IBL {

    @Override
    public Product getProductById(long productId) {
        Product product = DataSource.allProducts.stream().filter(prod -> (productId == prod.getProductId())).findAny().orElse(null);
        return product;
    }

    @Override
    public Order getOrderById(long orderId) {
        Order order = DataSource.allOrders.stream().filter(order1 -> (orderId == order1.getOrderId())).findAny().orElse(null);
        return order;
    }

    @Override
    public Customer getCustomerById(long customerId) {
        Customer customer = DataSource.allCustomers.stream().filter(customer1 -> (customerId == customer1.getId())).findAny().orElse(null);
        return customer;
    }


    @Override
    public List<Product> getProducts(ProductCategory cat, double price) {
        List<Product> lst = DataSource.allProducts.stream().filter(product -> (product.getCategory() == cat)).collect(toList())
                .stream().filter(product -> (product.getPrice() <= price)).collect(toList());
        lst.sort(Comparator.comparing(Product::getProductId));

        return lst;
    }

    @Override
    public List<Customer> popularCustomers() {
        //To do
        return null;
    }

    @Override
    public List<Order> getCustomerOrders(long customerId) {
        //To do
        return null;
    }

    @Override
    public long numberOfProductInOrder(long orderId) {
        //To do
        return 0;
    }

    @Override
    public List<Product> getPopularOrderedProduct(int orderedtimes) {
        //To do
        return null;
    }

    @Override
    public List<Product> getOrderProducts(long orderId) {
        //To do
        return null;
    }

    @Override
    public List<Customer> getCustomersWhoOrderedProduct(long productId) {
        //To do
        return null;
    }

    @Override
    public Product getMaxOrderedProduct() {
        //To do
        return null;

    }

    @Override
    public double sumOfOrder(long orderID) {
        //To do
        return 0;
    }

    @Override
    public List<Order> getExpensiveOrders(double price) {
        //To do
        return null;
    }

    @Override
    public List<Customer> ThreeTierCustomerWithMaxOrders() {
        //To do
        return null;

    }

}
