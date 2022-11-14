package ThirdIteration.product;
public class Product {

    int index;
    String productName;
    int quantity;
    double price;

    public Product() {}

    public Product(int index, String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.index = index;
    }

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return  index + " - " +
                productName +
                ", quantity = " + quantity +
                ", price = " + price;
    }
}



