package L4;

import java.util.Arrays;

public class Account implements Wishlist {
    private String email;
    private String user;
    private String pass;
    private String address;
    private String[] Comenzi;

    public Account() {
    }

    public String getEmail() {
        return email;
    }
    public String getUser() {
        return user;
    }
    public String getPass() {
        return pass;
    }
    public String getAddress() {
        return address;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void wishlist(String... b) {
        System.out.println("Pe wishlist este: " + Arrays.toString(b));
    }

    public void Daucomanda(String... comanda) {
        this.Comenzi = comanda;
        System.out.println("Comanda este: " + Arrays.toString(this.Comenzi));
    }

    public void retur(String retur) {

        int Test=0;

        // metoda repetitiva pentru a testa fiecare componenta din comenzi
        for (int x = 0; x < Comenzi.length; x++) {

            if (this.Comenzi[x] == retur) {
                Test = 0;
                break; // daca este true, adica sunt egale, Test ia valoarea 0 si se opreste for
            } else {
                Test = 1; // daca este false, Test ia valoarea 1
            }
        }

        // in functie de valoarea lui test se va printa unul din mesaje
        switch (Test) {
            case 0:
                System.out.println("Se poate face retur la: "+retur);
                break;
            case 1:
                System.out.println("Nu se poate face retur la: "+retur);
                break;
            default:
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "email='" + email + '\'' +
                ", user='" + user + '\'' +
                ", pass='" + pass + '\'' +
                ", address='" + address + '\'' +
                ", Comenzi=" + Arrays.toString(Comenzi) +
                '}';
    }
}