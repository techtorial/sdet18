package scannerPractice;

import java.util.Scanner;

public class MoneyTransaction {
    public static void main(String[] args) {
        /*
            David wants to deposit his money into his bank account and spent some
            help David to find out his final dollar amount

            -he already got $200 in his account
            -he got three different paychecks ($480, $600 and $350)
            !!-he can only deposit one paycheck at a time
            -after he got his money in the account
            -he bought a phone for $599 and headphone for $299
            -calculate his final money in his account
*/
        Scanner scanner = new Scanner(System.in);

        double money = 200;
        System.out.println("enter your first check amount");
        double check1 = scanner.nextDouble();
        money = money+  check1;

        System.out.println("enter your second check amount");
        double check2 = scanner.nextDouble();
        money = money+  check2;

        System.out.println("enter your third check amount");
        money += scanner.nextDouble();
        System.out.println("MONEY NOW >> "+money);

        System.out.println("enter price for PHONE");
        money  = money -scanner.nextDouble();
        System.out.println("enter price for HEAD - PHONE");
        money  = money -scanner.nextDouble();

        System.out.println("FINAL MONEY IS "+ money);




    }
}
