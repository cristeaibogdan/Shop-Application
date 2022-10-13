package SecondIteration.customer;

import java.util.Objects;

public class Account {

    private String user;
    private String pass;

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

    public Account(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public Account(){};

    @Override
    public String toString() {
        return "Account{" +
                "user='" + user + '\'' +
                ", pass='" + pass + '\'' +
                '}';
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
}



