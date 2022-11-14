package ThirdIteration.test;
import ThirdIteration.product.Product;
import java.util.HashSet;

public class OneToAnother {
    public static void main(String[] args) {

        HashSet<Product> products = new HashSet<>();

        products.add(new Product(3,"test", 100,3.99));
        products.add(new Product(1,"Potatoes", 100,2.2));
        System.out.println(products);

        HashSet<Product> copy = new HashSet<>();

        int choice = 1;

        products.stream().filter(product -> product.getIndex()==choice).forEach(account -> copy.add(account));
        System.out.println("am adaugat un element: "+copy);

        Product selectedProduct = products.stream().filter(product -> product.getIndex() == choice).findAny().orElse(null);
        System.out.println("produsul selectat: "+selectedProduct);
    }
}

