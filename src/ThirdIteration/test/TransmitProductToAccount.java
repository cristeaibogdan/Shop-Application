package ThirdIteration.test;
import ThirdIteration.account.Account;
import ThirdIteration.product.Product;

import java.util.HashSet;

public class TransmitProductToAccount {
    public static void main(String[] args) {

        HashSet<Account> accountlist = new HashSet<>();
        accountlist.add(new Account("user","pass",true));
        accountlist.add(new Account("1","1"));

        HashSet<Product> products = new HashSet<>();

        products.add(new Product(3, "test", 100, 3.99));
        products.add(new Product(1, "Potatoes", 100, 2.2));
        products.add(new Product(2, "Tomatoes", 100, 3.99));

        Product testProduct = new Product(4, "Cookie", 100, 3.99);

        int choice = 2;

        Account currentAccount = accountlist.stream().filter(account -> account.isCurrent()).findAny().orElse(null);
        System.out.println("contul current: "+currentAccount); //1. Selected the current account

        Product selectedProduct = products.stream().filter(product -> product.getIndex() == choice).findAny().orElse(null);
        System.out.println("produsul selectat: "+selectedProduct); //2. Selected the product to add

        currentAccount.addProduct(selectedProduct); //3. Add Product to account
        currentAccount.addProduct(testProduct); //4. Add another Product to account

        System.out.println("contul cu produsul cumparat: "+currentAccount);
    }
}
