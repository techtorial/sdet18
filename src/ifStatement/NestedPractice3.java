package ifStatement;

import java.util.Scanner;

public class NestedPractice3 {
    public static void main(String[] args) {
//        #  getting ticket for speed violation
//#   in state of IN, speed limit on HighWays is 70
//#   in other states, speed limit on Highways is 55
//#   -if driver exceeds speed limit for up to 10% of the limit in each state,
//#    we will give WARNING in that state
//#     state of IN warning means --> print --> "YELLOW WARNING"
//#     other states warning means --> print --> "CITATION"
//# -if driver exceeds speed limit more than 10% of the limit in each state,
//#  we will give TICKET in that state
//#     state of IN ticket means --> print --> "$150 and 5 points"
//#     other states ticket means --> print --> "$100"
//# -if speed is same as  speed limit or lower, --> print --> "You are driving safe!"
//
// User should provide you state they are in and their speed.
     Scanner s = new Scanner(System.in);
     String stateCode = s.next();
     int speedOfUser = s.nextInt();
     if(stateCode.equalsIgnoreCase("IN")){
         // this if statement is for when user is in Indiana
         int inSpeedLimit= 70; // finding up to ten percent
         // 10 percent -> 10/100 -> one tenth of a value
         int tenPercentUpTo = inSpeedLimit + (inSpeedLimit/10);
         if (speedOfUser<inSpeedLimit){
             System.out.println("Driver is driving safe.");
         }else if (speedOfUser<=tenPercentUpTo){
             System.out.println("YELLOW WARNING");
         }else{
             System.out.println("$150 and 5 points");
         }
     }else{
         // This else statement is for all other states
         int otherSpeedLimit= 55; // finding up to ten percent
         // 10 percent -> 10/100 -> one tenth of a value
         int tenPercentUpToOther = otherSpeedLimit + (otherSpeedLimit/10);
         if (speedOfUser<otherSpeedLimit){
             System.out.println("Driver is driving safe.");
         }else if (speedOfUser<=tenPercentUpToOther){
             System.out.println("CITATION");
         }else{
             System.out.println( "$100");
         }
     }
    }
}
