package SecondIteration;
import SecondIteration.customer.AccountOptions;
import SecondIteration.customer.AccountCreation;
import SecondIteration.customer.AccountReader;

import java.util.Scanner;
public class Usage {
    public static void main(String[] args) {
        Scanner selection = new Scanner(System.in);
        boolean value = false;

        //Big attention not to close scanners that have System.in, in them
        //or the program will throu an exception!

        do {

            System.out.println("Select an option: ");
            System.out.println("1 - Create account");
            System.out.println("2 - Login");

            switch (selection.nextLine()) {
                case "1":
                    value = false;
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
    }
}

