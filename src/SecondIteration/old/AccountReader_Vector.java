package SecondIteration.old;
import SecondIteration.customer.Account;
import java.io.*;
import java.util.Scanner;

@Deprecated
public class AccountReader_Vector {
    public static void main(String[] args) {

        Account[] accounts = new Account[100]; //find something to make that 100 flexible!
        boolean value = false;
        int index = 0;
        int counter = 3;

        do { // to repeat if login is not successful

            Scanner reader = new Scanner(System.in);
            System.out.println("->Account login process<-");

            System.out.println("Type user: ");
            String user = reader.nextLine();

            System.out.println("Type pass: ");
            String pass = reader.nextLine();

            try (Scanner scanner = new Scanner(new FileInputStream("data_deprecated.txt"))) {

                while (scanner.hasNext()) {
                    //1.Scan line
                    String accountLine = scanner.nextLine();
                    //System.out.println("Line read is: " + accountLine);

                    //2.Break line in words, split by " " (empty string)
                    String[] accountComp = accountLine.split("\\|");

                    //2.1. Verify step 2 is working
//                    for (int i = 0; i < accountComp.length; i++) {
//                        System.out.println("\tComponenta " + i + " este " + accountComp[i]);
//                    }

                    //3.Create object of Account type using the above components
                    Account account = new Account(accountComp[0], accountComp[1]);
                    //System.out.println("Scanned account is: " + account);

                    //4.Insert created objects in Account[] vector
                    accounts[index] = account;
                    index++;
                }

            } catch (FileNotFoundException fe) {
                System.out.println("File not found!");
            }

            try {
                for (Account test : accounts) {

                    if (test == null) {
                        System.out.println("Invalid user or pass. Try again!");
                        value = false;
                        break;
                    }

                    if (test.getPass().equals(pass) && test.getUser().equals(user)) {
                        System.out.println("Log in success!");
                        value = true;
                        break;
                    }
                }
            } catch (NullPointerException ne) {
                System.out.println("NullPointer exception!");
            }
        } while (value == false);
    }
}



