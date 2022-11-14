package ThirdIteration.account;
import java.util.Objects;
public class Account extends Address {

    private String user;
    private String pass;
    private boolean current=false;

    public Account() {}

    public Account(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public Account(String user, String pass, boolean current) {
        this.user = user;
        this.pass = pass;
        this.current=current;
    }

    public Account(String user, String pass, boolean current, String country, String city, String street, int streetNumber) {
        this.user = user;
        this.pass = pass;
        this.current=current;
        setCountry(country);
        setCity(city);
        setStreet(street);
        setStreetNumber(streetNumber);
    }

    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean isCurrent() {
        return current;
    }
    public void setCurrent(boolean current) {
        this.current = current;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return user.equals(account.user) && pass.equals(account.pass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, pass);
    }

    @Override
    public String toString() {
        return "Account{" +
                "user='" + user + '\'' +
                ", pass='" + pass + '\'' +
                ", current=" + current +
                ", country=" + getCountry() +
                ", city=" + getCity() +
                ", street=" + getStreet() +
                ", streetNumber=" + getStreetNumber() +
                ", productBuys=" + getProductBuys() +
                '}';
    }
}
