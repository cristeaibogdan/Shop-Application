package SecondIteration.customer;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class AccountCreation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try (FileWriter fileWriter = new FileWriter("data.txt",true)) {; // can add to existing files

            System.out.println("->Account creation process<-");

            System.out.println("Type user: ");
            String user = input.nextLine();

            System.out.println("Type pass: ");
            String pass = input.nextLine();

            System.out.println("Account successfully created!");
            System.out.println("Your user is: " + user.trim() + " and your pass is: " + pass.trim());

            fileWriter.write(user.trim()+"|"+pass.trim()+"\n");

        } catch (FileNotFoundException e) {
            System.out.println("Fisierul nu a fost gasit!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("A aparut o exceptie IO");
            e.printStackTrace();
        }
    }
}