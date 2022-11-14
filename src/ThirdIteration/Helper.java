package ThirdIteration;
import ThirdIteration.account.Account;
import ThirdIteration.product.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Helper {
    public static Account create() {

        Scanner input = new Scanner(System.in);

        System.out.println("=>Account creation process<=");

        System.out.println("Type user:");
        String user = input.nextLine();

        System.out.println("Type pass:");
        String pass = input.nextLine();

        Account account = new Account(user, pass);
        System.out.println("User: " + user.trim() + " and Pass: " + pass.trim());
        return account;
    }

    public static boolean check(HashSet<Account> accountlist) {

        Scanner input = new Scanner(System.in);

        System.out.println("=>Account login process<=");

        System.out.println("Type user:");
        String user = input.nextLine();

        System.out.println("Type pass:");
        String pass = input.nextLine();

        for (Account account : accountlist) {
            if (account.getUser().equals(user) && account.getPass().equals(pass)) {
                System.out.println("Login success!");
                account.setCurrent(true);
                return true;
            }
        }
        System.out.println("Invalid user or pass!");
        return false;
    }

    public static void show(HashSet<Account> accountlist) {
        System.out.println("AccountList: ");
        for (Account account:accountlist){
            System.out.println("\t" + account);
        }
    }

    public static void currentAccount(HashSet<Account> accountlist) {
        for (Account account : accountlist) {
            if (account.isCurrent()) {
                System.out.println("Account credentials: " + account);
                break;
            }
        }
    }

    public static void setAddress(HashSet<Account> accountlist) {
        for (Account account : accountlist) {
            if (account.isCurrent()) {

                System.out.println("Account address: ");
                System.out.print("Country: "+account.getCountry());
                System.out.print("City: "+account.getCity());
                System.out.print("Street: "+account.getStreet());
                System.out.print("Number: "+account.getStreetNumber());

                Scanner input = new Scanner(System.in);

                System.out.println("Country: ");
                account.setCountry(input.nextLine());

                System.out.println("City: ");
                account.setCity(input.nextLine());

                System.out.println("Street: ");
                account.setStreet(input.nextLine());

                System.out.println("Street number: ");
                account.setStreetNumber(input.nextInt());

                System.out.println("Account updated: " + account);
                break;
            }
        }
    }

    public static void unloader(HashSet<Account> accountlist) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("AccountManager.txt"))) {
            for (Account account : accountlist) {
                account.setCurrent(false);
                bufferedWriter.write(account.getUser() + "|" + account.getPass() + "|" + account.isCurrent() + "|" +
                        account.getCountry() + "|" + account.getCity() + "|" + account.getStreet() + "|" + account.getStreetNumber() + "\n");
            }

        } catch (IOException ioe) {
            System.out.println("A aparut o eroare IO!");
        }
    }

    public static void loader(HashSet<Account> accountlist) {

        try {
            //1. Defineste scanner cu .txt de unde citeste
            Scanner scanner = new Scanner(new FileInputStream("AccountManager.txt"));
            while (scanner.hasNext()) {

                //2. Scaneaza linia si atribuie unui String
                String accountLine = scanner.nextLine();
                //System.out.println("read line: " + accountLine);

                //3. Pune componentele liniei intr-un vector String[]
                String[] linecomponents = accountLine.split("\\|");

                //4. Creeaza un cont nou cu toate componentele
                Account account = new Account(linecomponents[0],linecomponents[1],false,linecomponents[3],
                        linecomponents[4],linecomponents[5],Integer.parseInt(linecomponents[6]));

                //5. Adauga in HashSet contul
                accountlist.add(account);
            }
            scanner.close();
        } catch (Throwable th) {
            System.out.println("Text file not found. Will be created after creating an account! "+th.getMessage());
        }
    }

    public static void delete(HashSet<Account> accountlist) {

        //Method 1:
//        for (Iterator<Account> iterator =accountlist.iterator();iterator.hasNext();) {
//            Account account = iterator.next();
//            if (account.isCurrent()) {
//                iterator.remove();
//                System.out.println("Account "+account.getUser()+" deleted!");
//            }
//        }

        //Method 2:
        accountlist.stream()
                .filter(element->element.isCurrent())
                .forEach(element -> System.out.println("User: "+element.getUser()+" deleted!"));

        accountlist.removeIf(account -> account.isCurrent());
    }


    public static void buyProduct (HashSet<Account> accountlist, HashSet<Product> products) {

        Scanner input = new Scanner(System.in);

        System.out.println("Choose product index: ");
        int choice = input.nextInt();

        Account currentAccount = accountlist.stream().filter(account -> account.isCurrent()).findAny().orElse(null);
        System.out.println("contul current: "+currentAccount); //1. Selected the current account

        Product selectedProduct = products.stream().filter(product -> product.getIndex() == choice).findAny().orElse(null);
        System.out.println("produsul selectat: "+selectedProduct); //2. Selected the product with the input choice

        //3. Add the selected product to the current account
        currentAccount.addProduct(selectedProduct);
        System.out.println("contul cu produsul cumparat: "+currentAccount);

        //4. Somehow add it to the .txt file

    }
}


