package ifStatement;
import java.util.Scanner;
public class NestedPractice5 {
    int number = 4;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your car year?");

        int year = scanner.nextInt();

        // check if the year is even/oddIllinois requires vehicles to get inpected for every other year
        //
        //if your car's year is even it will be inspected next year(2024)
        //if your car's year is odd, it will be inspected this year(2023)
        //
        //when your car inspected this year your options are
        //  DMV office OR nearest FireStone store location depending on your home distance to DMV
        //    -you can go to nearest FireStone store if DMV distance is 5 miles or more from home
        //  when you are in the DMV inspection is FREE of charge
        //  when you go to FireStone inspection is $30 plus %10 tax.
        //
        // Let user know about their payment based on thier provided information
        //
        //if the inspection falls into next year
        //  Let user that "wait for another year for inspection"
        if (year % 2 ==0){
            System.out.println("Wait until next year to get inspected for your car");
        }else{
            System.out.println("how many miles are you from DMV location?");
            int distance = scanner.nextInt();

            if (distance >=5){
                System.out.println("You should go to FireStone Store");
                System.out.println("You need to pay: "+ ( 30 + ( 30 * 0.10)) + " since you are in FireStone");
            }else {
                System.out.println("You should go to DMV and Inspection is FREE");
            }
        }
       // System.out.println(distance);

    }
}
