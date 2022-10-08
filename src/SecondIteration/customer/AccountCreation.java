package SecondIteration.customer;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class AccountCreation {
    public static void main() {
        Scanner input = new Scanner(System.in);

        try (FileWriter fileWriter = new FileWriter("data.txt",true)) {; // can add to existing files

            System.out.println("->Account creation process<-");

            System.out.println("Type user: ");
            String user = input.next();

            System.out.println("Type pass: ");
            String pass = input.next();

            System.out.println("Account successfully created!");
            System.out.println("Your user is: " + user + " and your pass is: " + pass);

            fileWriter.write(user+" "+pass+"\n");

        } catch (FileNotFoundException e) {
            System.out.println("Fisierul nu a fost gasit!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("A aparut o exceptie IO");
            e.printStackTrace();
        }
    }
}