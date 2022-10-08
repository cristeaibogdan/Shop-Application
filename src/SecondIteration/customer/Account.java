package SecondIteration.customer;

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
}



