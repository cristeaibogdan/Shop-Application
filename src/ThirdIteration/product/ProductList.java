package ThirdIteration.product;
import java.util.HashSet;
public class ProductList {
    public static HashSet<Product> main() {

        HashSet<Product> products = new HashSet<>();

        products.add(new Product(1, "test", 100, 3.99));
        products.add(new Product(2, "Potatoes", 100, 2.2));
        products.add(new Product(3, "Tomatoes", 100, 3.99));

        for (Product product : products) {
            System.out.println(product);
        }
        return products;
    }

    //1. Need a loader and unloader as in Account
    //2. Need add and remove option just like in Account

}
