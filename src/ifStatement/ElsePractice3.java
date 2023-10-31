package ifStatement;

import java.util.Scanner;

public class ElsePractice3 {
    public static void main(String[] args) {
        //user will tell you house
        // check if the house is even/odd
        //if it is even tell the user that his/her house is on the right side of the street
        // otherwise -->                                            left side of the street
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your house number");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("your house is on the right side");
        } else {
            System.out.println("your house is on the left side");
        }
    }
}
