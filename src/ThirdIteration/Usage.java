package ThirdIteration;
import ThirdIteration.account.Account;
import java.util.HashSet;
import java.util.Scanner;
public class Usage {
    public static void main(String[] args) {

        HashSet<Account> accountlist = new HashSet<>();
        Helper.loader(accountlist);

        Scanner input = new Scanner(System.in);
        boolean value = true;

        while (value == true) {

            System.out.println("Choose an option:");
            System.out.println("1 - Create account");
            System.out.println("2 - Login");
            System.out.println("3 - Exit");
            System.out.println("4 - Check accounts");

            switch (input.nextLine()) {
                case "1":
                    accountlist.add(Helper.create());
                    break;
                case "2":
                    if (Helper.check(accountlist)) {
                        Options.main(accountlist);
                        value = false;
                    }
                    break;
                case "3":
                    Helper.unloader(accountlist);
                    System.exit(0);
                    break;
                case "4":
                    Helper.show(accountlist);
                    break;
                default:
                    System.out.println("Invalid input!");
            }
        }
    }
}

//TO DO
//1. Add further functionalities in Options
