package Primitives;

public class ArithmeticPractice {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 10;
        // addition --> +
        System.out.println(  num1 + num2); // 15
       int result =  num1 + num2;
        System.out.println(result); //15

        // subtraction >> -
        int result2 = num1 - num2;
        System.out.println(result2);
        System.out.println(result - num1 );

        // multiplication  --> *
        System.out.println(num1 * num2);

        int result3 = num1 * num2;
        System.out.println(result3);

        // division >> /
        System.out.println( 5 / 2 ); // 2
        System.out.println( 5 / 2.0 ); // 2.5

        int num3 = 20;
        double num4 = 3;
        System.out.println(  num3/num4  ); // 6.666
        double d = num3/num4;

       // int a = 3.0; 3.0 is not whole number since there is decimal point

        // modulus - remainder --> %

        /*

        20 cookies
        3 people are sharing
        2 left over cookies
         */

        int cookies = 20;
        int people = 3;

        // want to find out left over amount of cookies after sharing
        System.out.println(cookies % people ); // 2
        int leftOver = cookies % people;
        System.out.println( leftOver+" cookies are left over.");

        // find out remainder for:
        // if there are 25 drinks at the table
        // there are 12 kids to share
        // PRINT >> "Remaining number of drink is: .1."

        int drinks = 25;
        int kids = 12;
        System.out.println( "Remaining number of drink is: " + (drinks % kids ));

    }
}
