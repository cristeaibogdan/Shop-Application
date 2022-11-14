package ThirdIteration;
import ThirdIteration.account.Account;
import ThirdIteration.product.Product;
import ThirdIteration.product.ProductList;
import java.util.HashSet;
import java.util.Scanner;
public class Options {
    public static void main(HashSet<Account> accountlist) {

        boolean value=false;
        Scanner input = new Scanner(System.in);

        System.out.println("Select an option: ");
        System.out.println("1 - See user credentials");
        System.out.println("2 - Modify address");
        System.out.println("3 - Buy");
        System.out.println("4 - My Orders");
        System.out.println("5 - Wishlist");
        System.out.println("6 - Return a product");
        System.out.println("7 - Log out");
        System.out.println("8 - Delete account");
        System.out.println("9 - Check accounts");

        do {

            switch (input.nextLine()) {
                case "1":
                    value = true;
                    Helper.currentAccount(accountlist);
                    break;
                case "2":
                    value = true;
                    Helper.setAddress(accountlist);
                    break;
                case "3":
                    value = true;
                    HashSet<Product> productList = ProductList.main();
                    Helper.buyProduct(accountlist, productList);
                    break;
                case "4":
                    value = true;

                    break;

                case "5":
                    value = true;

                    break;
                case "6":
                    value = true;

                    break;
                case "7":
                    value = true;
                    Helper.unloader(accountlist);
                    Usage.main(null);
                    break;
                case "8":
                    value = true;
                    Helper.delete(accountlist);
                    Helper.unloader(accountlist);
                    Usage.main(null);
                    break;
                case "9":
                    value = true;
                    Helper.show(accountlist);
                    break;
                default:
                    value = false;
                    System.out.println("Invalid input!");
                    break;
            }
        } while (value);
    }
}
