package ifStatement;

import java.util.Scanner;

public class DaysOfWeek {

    public static void main(String[] args) {

        /*
        get an integer number from user between 1 and 5
        1 --> "it is Monday"
        2 --> "it is Tuesday"
        3 --> "it is Wednesday"
        4
        5 ...
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer value btwn 1 and 5");
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("it is Monday");
        }
        if (number == 2) {
            System.out.println("it is Tuesday");
        }
        if (number == 3) {
            System.out.println("it is Wednesday");
        }
        if (number == 4) {
            System.out.println("it is Thursday");
        }
        if (number == 5) {
            System.out.println("it is Friday");
        }
        if (number>5 || number<1){
            System.out.println("invalid Number");
        }


    }

}
