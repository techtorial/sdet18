package objectMethodPractice;

public class TestBankAccount {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.displayInfo();
        account.password = "bank123";
        account.userName = "bank123";
        account.balance = 100;
        account.displayInfo();
        account.deposit(500);
        account.withdraw(9.99);

        account.displayInfo();

        account.logIn("bank123","bank123");
        account.displayInfo();
    }
}
