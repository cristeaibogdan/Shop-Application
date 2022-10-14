package SecondIteration.customer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AccountCredentials {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(new FileInputStream("CurrentAccount.txt"))) {

            //1.Scan line
            String accountLine = scanner.nextLine();
            //System.out.println("Line read is: " + accountLine);

            //2.Break line in words, split by "|" (empty string)
            String[] accountComp = accountLine.split("\\|");

            System.out.println("Your account user is: "+accountComp[0]);
            System.out.println("Your account pass is: "+accountComp[1]);

        } catch (FileNotFoundException fe) {
            System.out.println("File not found!");
        }
    }
}
