package ifStatement;

import java.util.Scanner;

public class ElsePractice {
    public static void main(String[] args) {


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
       else{
            System.out.println("Wrong Number entered!!");
        }

        System.out.println("=================");

       if ( 10 ==1 ){
           System.out.println("Numbers are equal");
       }else{
           System.out.println("They are NOT equal");
       }


    }
}
