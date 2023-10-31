package loopsPractice;

import java.util.Scanner;

public class whilePractice4 {
    public static void main(String[] args) {
        /*
        get an integer number from user
        create multiplication table for that number from 1 to 10
        EX: 7 >>> 7 * 1 = 7
                  7 * 2 = 14
                  7 * 3 = 21
                  ...
                  7 * 10 =70
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer number");
        int number = scanner.nextInt();

        int number2 = 1;
        while ( number2 <= 10 ){

            System.out.println(number + " * " +number2 + " = " +number * number2);
            number2++;
        }

    }
}
