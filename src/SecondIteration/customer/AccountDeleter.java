package SecondIteration.customer;
import java.io.*;
public class AccountDeleter {
    public static void main(String[] args) {

        File inputFile = new File("Accountlist.txt");
        File checkFile = new File("CurrentAccount.txt");
        File tempFile = new File("Tempfile.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedReader check = new BufferedReader(new FileReader(checkFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String currentLine;
            String lineToRemove = check.readLine();
            //System.out.println("Line to remove is: "+lineToRemove);

            while ((currentLine = reader.readLine()) != null) {

                //System.out.println(currentLine);
                if (currentLine.equals(lineToRemove)) {continue;}
                writer.write(currentLine + "\n");

            }

            inputFile.delete();
            tempFile.renameTo(inputFile);

        } catch (IOException ioe) {
            System.out.println("A aparut o eroare IO!");
        }
    }
}
