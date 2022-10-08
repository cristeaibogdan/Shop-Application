package SecondIteration;
import SecondIteration.customer.AccountOptions;
import SecondIteration.customer.AccountCreation;
import SecondIteration.customer.AccountReader;

import java.util.Scanner;
public class Usage {
    public static void main(String[] args)  {

        boolean value = false;
        Scanner selection = new Scanner(System.in);

        do {

        System.out.println("Select an option: ");
        System.out.println("1 - Create account");
        System.out.println("2 - Login");

            switch (selection.next()) {
                case "1":
                    value = true;
                    AccountCreation.main();
                    break;
                case "2":
                    value = true;
                    AccountReader.main();
                    AccountOptions.main();
                    break;
                default:
                    value = false;
                    System.out.println("Invalid selection!");
                    break;
            }

        } while (value == false);
        selection.close();
    }
}

