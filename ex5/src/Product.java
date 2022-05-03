

import static java.lang.Long.parseLong;

public class Product {
    private long ProductId;
    private String name;
    private ProductCategory category;
    private double price;

    public Product(String orderInfo) {
        String[] names = orderInfo.split(" ");

        setProductId(Long.parseLong(names[1]));
        setName(names[2]);
        setCategory(ProductCategory.valueOf(names[4]));
        setPrice(Double.parseDouble(names[6]));
    }

    public Product(long PId, String Pname, ProductCategory Pcategory, double Pprice) {
        setProductId(PId);
        setName(Pname);
        setCategory(Pcategory);
        setPrice(Pprice);

    }


    public String toString() {
        return "Product: " + getProductId() + " " + getName() + " category: " + getCategory() + " price: " + getPrice() + "\n";
    }

    public long getProductId() {
        return ProductId;
    }

    public void setProductId(long productId) {
        ProductId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}