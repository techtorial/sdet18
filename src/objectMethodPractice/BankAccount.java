package objectMethodPractice;

public class BankAccount {
    String userName, password, bankName = "BOA";
    double balance;
    boolean isLoggedIn;

    /*
    Methods:
- void displayInfo() ->will print out all account information
- double deposit() -> one parammeter to update balance
- double withdraw() -> one parameter to update balance
-void/boolean logIn() -> userName, password parameters to update isLoggedIn boolean.
* Test your implementation >> create a new test class to check your work
     */

    public void displayInfo() {
        if (isLoggedIn) {
            System.out.println("User Name: " + userName
                    + " -Password: " + password
                    + " -BankName: " + bankName
                    + " -Balance: " + balance
                    + " -IsLoggedIn: " + isLoggedIn);
        } else {
            System.out.println("Must log in First to see INFO");
        }

    }

    public double deposit(double depositAmount) {
        if (isLoggedIn) {
            balance += depositAmount;
            System.out.println("Your new balance after deposit of $" + depositAmount + " is: " + balance);
        } else {
            System.out.println("Log in first to make DEPOSIT");
            return 0;
        }
        return balance;

    }

    public double withdraw(double withdrawAmount) {
        balance -= withdrawAmount;
        System.out.println("Your new balance after withdraw of $" + withdrawAmount + " is: " + balance);
        return balance;
    }

    public void logIn(String user, String pass) {
        if (userName.equals(user) && password.equals(pass)) {
            System.out.println("You logged in!!");
            isLoggedIn = true;
        } else {
            System.out.println("Invalid Credentials!! Try Again");

        }
    }


}
