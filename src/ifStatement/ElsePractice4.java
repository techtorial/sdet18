package ifStatement;

import java.util.Scanner;

public class ElsePractice4 {
    public static void main(String[] args) {
        /*
        get the total spending amount from user
        if the total amount is $1000 and more >> 20% discount
        otherwise >> 5% discount
        in both cases> calculate final payment and discount/saving for user
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your spending amount");

        double spending = scanner.nextDouble();
        double discount;
        if (spending >= 1000) {
            // how to find 20% of any number >> number * 0.20
            discount = spending * 0.20;
            // how to find out final payment
            spending = spending - discount;
            System.out.println("Saving is: "+ discount + " final payment is: "+spending);
        }else {
            // how to find 5% of any number >> number * 0.05
            discount = spending * 0.05;
            // how to find out final payment
            spending = spending - discount;
            System.out.println("Saving is: "+ discount + " final payment is: "+spending);
        }

    }
}
