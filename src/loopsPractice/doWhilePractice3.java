package loopsPractice;

import java.util.Scanner;

public class doWhilePractice3 {
    public static void main(String[] args) {
        /*
        ask user to give you a whole number between 0 and 20
         create a star tree for that given number as in following format:
         ex: user number is >> 4
         *
         **
         ***
         ****
         -? you are going to print stars
         -? how many times? >> user gives that number
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 0 and 20");
        int number = scanner.nextInt();;
        String str = "*";

        do {
            System.out.println(str);
            str = str.concat("*");

            number--;
        }while (number > 0);

    }
}
