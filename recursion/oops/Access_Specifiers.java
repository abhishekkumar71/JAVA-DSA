public class Access_Specifiers {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Abhi";
        System.out.println(myAcc.username);

    }
}

/**
 * BankAccount
 */
class BankAccount {

    public String username;
    private String password;

    public void setpassword(String pwd) {
        password = pwd;

    }
}