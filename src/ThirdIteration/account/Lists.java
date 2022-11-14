package ThirdIteration.account;
import ThirdIteration.product.Product;
import java.util.HashSet;

public class Lists {
    private HashSet<Product> productBuys = new HashSet<>();
    private HashSet<Product> wishList = new HashSet<>();

    public HashSet<Product> getProductBuys() {
        return productBuys;
    }
    public void setProductBuys(HashSet<Product> productBuys) {
        this.productBuys = productBuys;
    }

    public void addProduct (Product product) {
        this.productBuys.add(product);
    }

    public void addToWishlist (Product product) {
        this.wishList.add(product);
    }
}
