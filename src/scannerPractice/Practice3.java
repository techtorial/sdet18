package scannerPractice;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {

        // "techtorial"
        // take very first char from incoming string

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string value");

        char str = scanner.nextLine().charAt(0);
        System.out.println("First letter is  >> "+str);

        // charAt();

        // next() --> it will read next string till first space
        System.out.println("Please enter another string value");
        char str2 = scanner.next().charAt(0);
        System.out.println(str2);

    }
}
