package Primitives;

public class Farm {
    public static void main(String[] args) {

        /*
        calculate numbers of legs in a farm if:
        21 cows and 45 chickens
        PRINT >> "The total of legs in this farm is: ..number.."
         */
        int cows = 21;
        int chickens = 45;
        int eachCowLeg = 4;
        int eachChickenLeg = 2;
        System.out.println("The total of legs in this farm is: " + (cows * eachCowLeg + chickens * eachChickenLeg));

        int totalLegs = cows * eachCowLeg + chickens * eachChickenLeg;
        System.out.println("There are " + totalLegs + " in this farm.");
        /*
        if each cow cost $1565.99 and each chicken costs $23.98
        find out total cost of animals
        >> This farm worth $... in total.
         */
// increase numbers of chicken by 100
        chickens = chickens + 100;

        double eachCow$ = 1565.99, eachChicken$ = 23.98;
        double totalCow$ = cows * eachCow$;
        double totalChicken$ = chickens * eachChicken$;
        double total$ = totalChicken$ + totalCow$;
        System.out.println("This farm worth "+ total$ + " in total.");


    }
}
