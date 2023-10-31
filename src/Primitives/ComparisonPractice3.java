package Primitives;

public class ComparisonPractice3 {
    public static void main(String[] args) {
        /*
        event for kids
	requirement for this event is: if age of kid is 6 they can attend
	"Your child can attend to this event ..T/F.."
         */

        int requiredAge = 6;
        int kidAge = 8;

        boolean canAttend = requiredAge == kidAge;
        System.out.println("Your child can attend to this event "+ canAttend);

        //event for kids who can attend if their age is 12 or less
        requiredAge = 12;

        boolean canAttend2 = kidAge <= requiredAge;

        boolean canAttend3 = requiredAge >= kidAge;

        System.out.println("Can attend2 >> "+canAttend2);
        System.out.println("Can attend3 >> "+canAttend3);

        boolean b1 = canAttend2 == canAttend3;
        System.out.println(" ---------- "+b1+" ----------" );

        // Delivery
        // if distance from store to home is 10 mi or less NO FEE
        // otherwise delivery fee is $5 if distance is 10 to 20 mi
        // after 20 miles it is $10

        // "You are paying delivery fee "+ ..T/F "FREE/$5/$10"

        int requiredDistance1 = 10;
        int myDistance = 10;

        boolean fee1  = myDistance <= requiredDistance1;
        System.out.println("You are not paying delivery fee "+ fee1);

        myDistance = 15;
        int minDistance = 11, maxDistance = 20;

       boolean r1 =  myDistance <= maxDistance;

       boolean r2 =  myDistance >= minDistance;

       boolean finalResult = r1 == r2;
        System.out.println("Paying $5 "+ finalResult);
        int lastRequiredDistance = 20;
        boolean r3 = myDistance  > lastRequiredDistance;
        System.out.println("Paying $10: "+ r3);

        System.out.println( true == true == false);

        System.out.println( true && true ||false);

    }
}
