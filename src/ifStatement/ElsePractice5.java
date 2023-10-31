package ifStatement;

import java.util.Scanner;

public class ElsePractice5 {

    public static void main(String[] args) {
        /*
        buying TV in IL or FL
        get TV price, distance from store and state from USER
        IL has 10% tax FL has 5% tax
        Il/FL delivery fee is free if the distance is 10 mi or less, Otherwise delivery fee is $50
        find out final payment for this TV purchase including tax and delivery fee
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter TV price");
        double tv$ = scanner.nextDouble();
        System.out.println("Enter your State IL/FL");
        String state = scanner.next();
        System.out.println("Enter distance form store as > integer ");
        int distance = scanner.nextInt();
        double finalPayment;

//        if (state.equalsIgnoreCase("IL") && distance < 5){
//            // no delivery fee in this case
//            // payment >> TV + tax
//                       finalPayment =     tv$ +  tv$ * 0.10;
//            System.out.println("IL closer to store, Payment is: "+finalPayment);
//
//        }else{
//            finalPayment =     tv$ +  tv$ * 0.10 + 50;
//            System.out.println("IL FAR from store, Payment includes delivery fee : "+finalPayment);
//        }
//        if (state.equalsIgnoreCase("FL") && distance < 5){
//            // no delivery fee in this case
//            // payment >> TV + tax
//            finalPayment =     tv$ +  tv$ * 0.05;
//            System.out.println("FL closer to store, Payment is: "+finalPayment);
//
//        }else{
//            finalPayment =     tv$ +  tv$ * 0.05 + 50;
//            System.out.println("FL FAR from store, Payment includes delivery fee : "+finalPayment);
//        }
        System.out.println("======================");

        if (state.equalsIgnoreCase("IL") && distance < 5){
            // no delivery fee in this case
            // payment >> TV + tax
            finalPayment =     tv$ +  tv$ * 0.10;
            System.out.println("IL closer to store, Payment is: "+finalPayment);

        }
        if (state.equalsIgnoreCase("IL") && distance > 5){
            // no delivery fee in this case
            // payment >> TV + tax
            finalPayment =     tv$ +  tv$ * 0.10 +50;
            System.out.println("IL, FAR to store, Payment is: "+finalPayment);

        }
        if (state.equalsIgnoreCase("FL") && distance < 5){
            // no delivery fee in this case
            // payment >> TV + tax
            finalPayment =     tv$ +  tv$ * 0.05;
            System.out.println("FL, closer to store, Payment is: "+finalPayment);

        }  if (state.equalsIgnoreCase("FL") && distance > 5){
            // no delivery fee in this case
            // payment >> TV + tax
            finalPayment =     tv$ +  tv$ * 0.05 +50;
            System.out.println("FL FAR to store, Payment is: "+finalPayment);

        }


    }
}
