package L4;

public class Usage {
    public static void main(String[] args) {

        Account Account_One = new Account();
        Account_One.setEmail("ne@mail");
        Account_One.setUser("One");
        Account_One.setPass("One_One");
        Account_One.setAddress("Lipia");
        System.out.println(Account_One);

        Account_One.wishlist("candy","t-shirt", "drinks");
        Account_One.Daucomanda("beer", "apples", "water");
        Account_One.retur("nothing");
        System.out.println(Account_One);
    }
    //aceasta este o modificare
}
