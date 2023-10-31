package stringPractice;

import java.util.Scanner;

public class MethodTask2 {
    public static void main(String[] args) {
        /*
        	 Ask user to provide his/her full name  and birth year in following format:
	        John Meza - 1999
           -check if the input string starts with >> your name
            -check if the input string ends with >> your birth year
            -check if the input string contains your full name with space between name and last name >> your full name
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your full name and birth year in following format: \nJohn Meza - 1999");

        String userInput = sc.nextLine();
        // String myName = "John";

        // "efe brown 2009"
        boolean b1 = userInput.startsWith("efe");
        System.out.println(b1);
        boolean b2 = userInput.endsWith("2002");
        System.out.println(b2);
        boolean b3 = userInput.contains("efe Mark");
        System.out.println(b3);

        System.out.println(     "---------------"    );




    }
}
