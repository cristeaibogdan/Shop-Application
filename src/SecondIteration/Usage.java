package SecondIteration;
import SecondIteration.customer.AccountOptions;
import SecondIteration.customer.AccountCreation;
import SecondIteration.customer.AccountReader;
import SecondIteration.old.AccountReader_Vector;

import java.util.Scanner;
public class Usage {
    public static void main(String[] args) {
        Scanner selection = new Scanner(System.in);
        boolean value = false;

        //Big attention not to close scanners that have System.in, in them
        //or the program will throw an exception!

        while (value == false) {

            System.out.println("Select an option: ");
            System.out.println("1 - Create account");
            System.out.println("2 - Login");
            System.out.println("3 - Exit");

            switch (selection.nextLine()) {
                case "1":
                    value = false;
                    AccountCreation.main(null);
                    break;
                case "2":
                    value=true;
                    AccountReader.main(null);
                    AccountOptions.main(null);
                    break;
                case "3":
                    value = true;
                    System.exit(1);
                    break;
                default:
                    value = false;
                    System.out.println("Invalid selection!");
                    break;
            }
        }
    }
}
