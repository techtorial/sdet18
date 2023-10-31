package Primitives;

public class LogicalPractice2 {
    public static void main(String[] args) {

        // there is a party for adults who can attend
        // if the age is greater than 18 (inclusive) OR they have $1000

        double myMoney = 3450, requiredMoney = 1000;
        int myAge = 21, requiredAge = 18;

        boolean b1 = myMoney >= requiredMoney || myAge >= requiredAge;
        System.out.println( b1 );

        myAge  = 17; myMoney =999.99;
        b1 = myMoney >= requiredMoney || myAge >= requiredAge;
        System.out.println( b1 ); //

        myAge  = 17; myMoney =999.99 + 0.01;
        b1 = myMoney >= requiredMoney || myAge >= requiredAge;
        System.out.println( b1 ); //
        System.out.println("----------------");

        /*
        test1 ,test2, test3 >> average of your tests must be greater than 70 points
        your attendance rate must be 90 percent or more
        when both requirements are okay, you can pass the class
         */
        double t1 = 100, t2 = 60, t3 = 50, myAverage = (t1 +t2+t3)  / 3, requiredAverage = 70, myAttendance = 100, requiredAttendance = 90;
        System.out.println( myAverage);

        System.out.println( (myAverage > requiredAverage   && myAttendance >= requiredAttendance )+ " that you can pass this class");



        /*
         !
         + , -
         > , <
         && ||
         */

        System.out.println(    !true || (5 * 2 > 20)            );

        System.out.println(  5 - 3 != 3 && !("john" != "sam")    );

        System.out.println( true || true || false && false);






    }
}
