package scannerPractice;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String myName = "David";
        System.out.println(myName);// David
        System.out.println("Hey david please enter your last name in console");

        String myLastName = scanner.nextLine();// take string from next line in the console
        System.out.println(myLastName + " is my new last name");

        // ask david to enter his address
        // take his address as string
        // PRINT >> "Your address is as following: ....."
        System.out.println("please enter your address");
        String address = scanner.nextLine();
        System.out.println("Your address is as following: " + address);


        System.out.println("Please enter your age");

       // String age = scanner.nextLine();// taking string/text
        int age = scanner.nextInt();
        System.out.println("is this your age?  :) >> "+age);

        // find out davids age in 13 years and tell him

        System.out.println(13 + age );
        age = age + 13;
        System.out.println("********"+age + "********");
        // get david's zipcode and check if it is 60602
        // print >> you entered correct zipcode : T/F
        System.out.println("please enter your zipcode");
        int zipCode = scanner.nextInt();
        boolean result = zipCode == 60602;
        System.out.println("you entered correct zipcode : "+result );



    }
}
