package SecondIteration.customer;
import SecondIteration.Usage;

import java.util.Scanner;
public class AccountOptions {
    public static void main(String[] args)  {

        boolean value;
        Scanner input = new Scanner(System.in);

        System.out.println("Select an option: ");
        System.out.println("1 - See user credentials");
        System.out.println("2 - Set up addresses");
        System.out.println("3 - Buy");
        System.out.println("4 - My Orders");
        System.out.println("5 - Wishlist");
        System.out.println("6 - Return a product");
        System.out.println("7 - Log out");
        System.out.println("8 - Delete account");

        do {

            switch (input.nextLine()) {
                case "1":
                    value = true;
                    AccountCredentials.main(null);
                    break;
                case "2":
                    value = true;

                    break;
                case "3":
                    value = true;

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
                    Usage.main(null);
                    break;

                case "8":
                    value = true;
                    AccountDeleter.main(null);
                    System.out.println("Account has been deleted!");
                    Usage.main(null);
                    break;

                default:
                    value = false;
                    System.out.println("Invalid input!");
                    break;
            }

        } while (value != true);
    }
}

