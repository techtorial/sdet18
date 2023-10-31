package ifStatement;

import java.util.Scanner;

public class TimeOfDay {
    public static void main(String[] args) {
        /*
        get one number from user between 1 and 11
        get one string as am or pm

        "Goode Morning"  / "Good Evening"
        when the number is 1 - 11 and AM >> "Good Morning"
        when the number is 1 -11 and PM >> "Good Evening"
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number between 1 and 11");
        int number = scanner.nextInt();
        System.out.println("Is it am or pm? please enter as: am/pm");
        String amPM = scanner.next();

        if( ( number >=1 && number<= 11) && amPM.equalsIgnoreCase("am")     ) {
            System.out.println("Good Morning");
        }
        if ( ( number >=1 && number<= 11) && amPM.equalsIgnoreCase("pm") ){
            System.out.println("Good Evening");
        }
    }
}
