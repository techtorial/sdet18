package ifStatement;

import java.util.Scanner;

public class NestedPractice4 {
//    # In the factory we need to create a program that can
//# find if we can do the shipment and, if we can do the shipment
//# it will tell us how many small package we should ship.
//# First we need to get total kilogram of the shipment,
//# to reach this total kilogram of shipment we can use small and big packages.
//# Every big package is 5 kilogram and every small packages is 1 kilogram.
//# We have limited amount of small and big packages.
//# Ask user how many big and how many small package  they have.
//            # Ask user what is the total goal kilogram of the shipment.
//# Print whether they can ship, if they can ship print how many small packages they need.
//            # Assume big packages is used before small packages.

    // I have the inventory number for big packages
    //  I have the inventory number for small packages
    // I have the shipment goal that I exactly need to match
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Enter inventory of big pack");
        int inventoryBigPck = s.nextInt();
        System.out.println("Enter inventory of small pack");
        int inventorySmallPck = s.nextInt();
        System.out.println("Enter how much exactly do we need to ship? ");
        int shipmentGoal = s.nextInt();

        // i need to find amount of big package needed
        //25 kg shipment -> you need 25 / 5 -.  5 big package

        int bigPckNeeded = shipmentGoal / 5;
// line 35 to 43 covers where we can ship when there is enough big package
        if (bigPckNeeded <= inventoryBigPck){
            // If i go in this if statement I know that i have enough big package
            // Second check that I should do is if I have enough small package
            // i need to find amount of small package needed
            // 21 -> we have enough big package how many small package?
            int smallPackageNeeded = shipmentGoal % 5;
            if (inventorySmallPck >= smallPackageNeeded){
                System.out.println("I can do the shipment");
            }else{
                System.out.println("I cannot do the ship");
            }

        }else if (bigPckNeeded>inventoryBigPck){ // we are going to cover conditions where we can ship
                // and there is not enough big package
                // we have 2 big packages and 21 small packages
                // i want to ship 29 kg?
                // First I will use all the big packages i have
                int totalOfBigPackages = 5 * inventoryBigPck;
                int smallPackNeeded = shipmentGoal - totalOfBigPackages;
                if (inventorySmallPck>=smallPackNeeded){
                    System.out.println("I can do the shipment");
                }else{
                    System.out.println("shipment is not possible");
                }



            }




        }











    }

















