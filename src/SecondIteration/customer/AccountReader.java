package SecondIteration.customer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
public class AccountReader {

    public static void main(String[] args) {

        ArrayList<Object> accList = new ArrayList<>();
        boolean value = false;
        int counter = 3;

        while (value == false) {

            Scanner reader = new Scanner(System.in);
            System.out.println("->Account login process<-");

            System.out.println("Type user: ");
            String user = reader.nextLine();

            System.out.println("Type pass: ");
            String pass = reader.nextLine();

            try (Scanner scanner = new Scanner(new FileInputStream("AccountList.txt"))) {

                while (scanner.hasNext()) {
                    //1.Scan line
                    String accountLine = scanner.nextLine();
                    //System.out.println("Line read is: " + accountLine);

                    //2.Break line in words, split by "|" (empty string)
                    String[] accountComp = accountLine.split("\\|");

                    //2.1. Verify step 2 is working
//                    for (int i = 0; i < accountComp.length; i++) {
//                        System.out.println("\tComponenta " + i + " este " + accountComp[i]);
//                    }

                    //3.Create object of Account type using the above components
                    Account account = new Account(accountComp[0], accountComp[1]);
                    //System.out.println("Scanned account is: " + account);

                    //4.Insert created objects in Account[] vector
                    accList.add(account);
                }

            } catch (FileNotFoundException fe) {
                System.out.println("File not found!");
            }

            for (Object o : accList) {
                //System.out.println(accList.get(index));
                Account objectOne = (Account) o;

                if (objectOne.getUser().equals(user) && objectOne.getPass().equals(pass)) {

                    //write in a separate text the credentials of the account that was used to log in
                    Path path = Paths.get("CurrentAccount.txt");
                    String currentaccount = objectOne.getUser()+"|"+objectOne.getPass();
                    try {
                        Files.write(path, currentaccount.getBytes());
                    } catch (IOException io) {
                        System.out.println("A aparut eroarea IO!");
                    }

                    System.out.println("Log in success!");
                    value = true;
                    break;
                }
                value = false;
            }

            if (value == false) {

                if (counter > 1) {
                    System.out.println("Invalid user or pass! You have " + counter + " more tries!");
                }

                if (counter == 1) {
                    System.out.println("Invalid user or pass! You have " + counter + " more try!");
                }

                if (counter == 0) {
                    System.out.println("Account temporarily blocked!");
                    System.exit(1);
                    break;
                }
                counter--;
            }
        }
    }
}



