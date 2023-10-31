package stringPractice;

import java.util.Scanner;

public class MethodTask3 {
    public static void main(String[] args) {
        /*
        ASK: Ask user to enter a String value which should have space at the beginning or end

            - Replace all letter 'a's with single '*' and letter 'e's with double '**',
            - change all string value to UPPERCASE
            - Find index of First '*'
            - Multiply above index value of '*' by 10 and
            - Print out the result as number
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string value with ending or leading spaces");

        String str = scanner.nextLine();

        str = str.replace('a', '*');
        str = str.replace("e", "**");
        System.out.println(str);
        str = str.toUpperCase();
        System.out.println(str);
        int indexNumber = str.indexOf('*');
        System.out.println(indexNumber);
        System.out.println(indexNumber * 10);

        str = str.trim();
        System.out.println(str);

        String ssn = "123456789";
        // mask first 5 digits of ssn with '*' >> *****6789
//        ssn =ssn.replace("12345", "**");
//        System.out.println(ssn);

        ssn =ssn.replace(ssn.substring(0,5), "*****");
        System.out.println(ssn);

    }
}
