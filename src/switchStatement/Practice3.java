package switchStatement;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        /*
        get a number from user between 1-5 and print matching week day name
        1 >> Monday
        2 >> Tuesday
        ..
        5 >> Friday
        cover invalid number entries >> "Not a valid number"
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 5");

        int dayNumber = sc.nextInt();

        switch (dayNumber) {
            case 4:
                System.out.println("Thursday");
                break;
// you cannot use duplicate case values in the switch
//            case 4:
//                System.out.println("Thursday");
//                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid entry");

        }


    }
}
